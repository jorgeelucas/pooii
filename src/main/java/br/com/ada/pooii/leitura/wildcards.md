# Wildcards

> Em códigos genericos, o ponto de interrogação (?) é chamado de _`wildcard`_ que representa um tipo desconhecido.

 _Wildcards podem ser usados em várias situações como tipo de um parâmetro, campo o variável local e as vezes até mesmo como tipo de retorno de um método (o que não é muito indicado pois é uma boa prática ser mais específico possível_


## Problemática

Um problema que podemos ter com _generics_ é que eles são **invariantes**, ou seja, só pode receber o objeto que foi definido e não suas variações. Vamos entender!

Pode parecer contraditório mas embora `String` seja um subtipo de `Object` - `List<String>` não é um subtipo de `List<Object>` ou vice versa.

Exemplo.:

**_Método (incorreto) para somar uma lista de números_**
```java
public static double somarListaDeNumeros(List<Number> numeros) {
  double resultado = 0.0;

  for (Number n : numeros) {
    resultado += n.doubleValue();
  }

  return resultado;
}
```

**_Testando nosso método_**
```java
List<Double> numeros = new ArrayList<>();
numeros.add(12.2);
numeros.add(10.8);

// tentando passar minha lista de double para o metodo pois Double é subtipo de Number
somarListaDeNumeros(numeros); //java: incompatible types: List<Double> cannot be converted to List<Number>
```

Então podemos pensar, "Eu só preciso fazer o método generico", certo? Errado!

Se adicionarmos um tipo generico, ele também fica **invariante**, ou seja, não aceita variações.

Ao modificar o método para generico teríamos que fazer um _cast_ de cada elemento para `Number` para poder ter acesso ao método `doubleValue()`

Isso acontece, novamente, porque os tipos genericos são **invariantes**.

> **_A declaração `<T extends Number>` não é permitida para TIPO DE PARÂMETRO, somente tipagem de classes e interfaces! Portanto o seguinte código não compila_**
```java
public static <T> double somarListDeNumeros(List<T extends Number> numeros) { /* ... */ }
```

### Solução

Para adicionar essa flexibilidade a mais, para ter tipos variantes como parâmetro, entram os `WILDCARDS` que pode ser separado em 3 tipos.

# 1. Upper Bounded Wildcards

Usamos esses _wildcards_ limitados para relaxar as restrições de uma variável, por exemplo, digamos que queremos um método que possa aceitar como parâmetro uma lista de numeros e seus subtipos (`List<Number>`, `List<Double>` ou `List<Integer>`)

Podemos alcançar isso adicionando o caractere de ponto de interrogação `?` seguido da palavra reservada `extends` (`extends` nesse contexo é usado tanto para classes quando para interfaces)

```java
List<? extends Number>...
```

**_O tipo de parametro do nosso método não deve ser `List<T>` ou `List<Number>` e sim `List<? extends Number>`_**
```java
public static double somarListaDeNumeros(List<? extends Number> numeros) {
  double resultado = 0.0;

  for (Number n : numeros) {
    resultado += n.doubleValue();
  }

  return resultado;
}
```

Ao ajustar nosso método para usar wildcards limitados, ganhamos a flexibilidade necessária - agora podemos receber como parâmetro tanto `List<Number>` quanto suas variações e.g `List<Double>` e o seguinte codigo passa a nos atender perfeitamente.
```java
List<Double> numeros = new ArrayList<>();
numeros.add(12.2);
numeros.add(10.8);

// tentando passar minha lista de double para o metodo pois Double é subtipo de Number
double resultado = somarListaDeNumeros(numeros);
System.out.println(resultado);  // 23.0
```

Com esse ajuste, estamos determinando que o método _somarListaDeNumeros_ aceite uma lista de qualquer coisa do tipo `Number` e seus subtipos.

# 2. Lower Bounded Wildcards

Um [upper bounded wildcard](#1-upper-bounded-wildcards) restringe o _tipo desconhecido_ para um tipo específico ou seus subtipos usando `extends`- de forma similar, um **lower bounded wildcard** restringe para um tipo específico e seus supertipos usando `super`

```java
List<? super Integer> lista;
```

Dessa forma deixamos um pouco mais restrito que a _upper bounded_

Exemplo: Queremos um método que adicione de 0 ate 10 (Integer) em uma lista pre-existente

**_Primeira tentativa com upper bounded_**
```java
public static void addNumeros(List<? extends Number> lista) {
  for (int i = 1; i <= 10; i++) {
    lista.add(i); // ERRO java: incompatible types:
  }
}
```

Isso acontece porque o parametro diz que aceita qualquer subtipo de `Number`, por exemplo, é possível passar uma lista de `Double` e quando eu tento adicionar um `Integer` ele falha porque ele não sabe converter automaticamente de `Double` para `Integer` afinal qual a relação dos dois tipos? Somente herdam de `Number` mas não têm relação

Para solucionar, devemos restringir nossa lista somente para `Integer` e seus supertipos, pois eles o aceitam com _casting_ implicito.

**_Para isso usamos a palavra reservada `super` ao invés de `extends`._**
```java
public static void addNumeros(List<? super Number> lista) {
  for (int i = 1; i <= 10; i++) {
    lista.add(i); // Tudo passa a funcionar!
  }
}
```

**_Testando nosso método_**
```java
List<Integer> lista1 = new ArrayList<>();
lista1.add(20);

// tentando adicionar de zero a dez na minha lista
addNumeros(lista1); // tudo funcionando e numeros adicionados

// ao tentarmos usa-lo com uma lista de double agora teremos erro de compilacao!
List<Double> lista2 = new ArrayList<>();
lista2.add(10.5);

//tentando adicionar
addNumeros(lista2); // ERRO de compilacao
```

Isso acontece porque o parametro 

# 3. Unbounded Wildcards

Os _WILDCARDS_ ilimitados é quando a gente usa o caractere de ponto de interrogação para o tipo (?), por exemplo

```java
List<?> lista;
```
Isso é chamado uma **lista de tipos desconhecidos**.

Segundo a [documentação da oracle](https://docs.oracle.com/javase/tutorial/java/generics/unboundedWildcards.html), existe dois cenários onde queremos usar `wildcards ilimitados`
* Se estamos escrevendo um método que pode ser implementado usando apenas funcionalidades presentes na classe `Object`
* Quando seu código não vai depender do tipo do parametro da lista, por exemplo: `List.size`, `List.clear`;
