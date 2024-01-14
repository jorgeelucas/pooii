# Generics em Java

> Generics dão mais estabilidade ao código fazendo com que seus bugs sejam detectados em tempo de compilação.

## Por que usar generics?

_Em resumo, _`generics`_ faz com que os tipos (**classes** e **interfaces**) sejam usados como parâmetros ao definir classes, interfaces e métodos oferecendo uma maneira de reutilizar o mesmo código com diferentes tipos de dados._
> Somente CLASSES e INTERFACES, não podemos passar um tipo primitivo como argumento para um objeto generico.

** Códigos que utilizam generics trazem muitos beneficios em relação aos que não utilizam.
* Forte verificação de tipos em tempo de compilação;
* Eliminação de _`cast`_;

```java
List listaDeNomes = new ArrayList();
listaDeNomes.add("maria");

// para obter o valor em um objeto tipado, precisamos do casting explicito
String primeiroElemento = (String) listaDeNomes.get(0);
```

**_Usando generics eliminamos a necessidade do Casting_**

```java
List<String> listaDeNomes = new ArrayList<>();
listaDeNomes.add("maria");

// sem necessidade de Cast
String primeiroElemento = listaDeNomes.get(0);
```

* Habilita a criação de **algoritmos genericos**;

## Usando generics

> Um tipo genérico é uma **classe** genérica ou **interface** que recebe um tipo como parâmetro.

**_Vamos começar com um exemplo de uma simples classe não generica responsável por imprimir um valor_**

```java
public class Impressora {

  private String textoParaImprimir;

  public void set(String txt) {
    this.textoParaImprimir = txt;
  }

  public String get() {
    return this.textoParaImprimir;
  }

  public void imprimir() {
    System.out.println(this.textoParaImprimir);
  }
}
```

**_Utilizando a classe Impressora de dentro do main_**

```java
Impressora impressora = new Impressora();
impressora.set("Olá, mundo!");
impressora.imprimir(); //Olá, mundo!
```

**_Tentando imprimir um Integer com a nossa classe Impressora_**
```java
Impressora impressora = new Impressora();
impressora.set(1997); // Erro: Required type: String, Provided: int
impressora.imprimir();
```

**_Uma versão generica da nossa classe, para aceitar tanto _String_ quando _Integer_ ficaria da seguinte forma_**
```java
public class Impressora<T> {

  private T paraImprimir;

  public void set(T obj) {
    this.paraImprimir = obj;
  }

  public T get() {
    return this.paraImprimir;
  }

  public void imprimir() {
    System.out.println(this.paraImprimir);
  }
}
```

> Uma classe genérica é definida da seguinte forma: _class nome<T1, T2, ..., Tn> { /* ... */ }_

_Em resumo, a seção de parâmetros de tipo, delimitada por colchetes angulares (<>), segue o nome da classe. Ela especifica os parâmetros de tipo (também chamados de variáveis de tipo) T1, T2, ..., e Tn._

**_Convenção de nomes de tipos de parâmetros_**

* `E` - Elemento (muito usado pelo framework de Coleções do Java: _Collection<E>_)
* `K` - Chave (_Map<K, V>_)
* `N` - Numero (_Number_)
* `T` - Tipo
* `V` - Valor (_Map<K, V>_)
* `S,U,V etc` - Segundo, terceiro tipo e assim por diante


## Invocando e instanciando um tipo generico

Para referenciar a nossa Impressora generica temos que usar uma forma especial, passando o Tipo que eu quero que toda ela se comporte:

**_Declarando a impressora generica passando um inteiro como parametro_**
```java
Impressora<Integer> impressora;
```

## Operador _Diamond_

A partir do `Java 7` podemos simplesmente remover o ultimo argumento, antes do construtor, de uma classe generica contanto que o compilador consiga determinar qual o tipo será inferido.

**_No nosso caso, o compilador consegue inferir a partir do argumento na declaração da variável_**

```java
Impressora<Integer> impressora = new Impressora<>();
```

> Podemos pensar na instanciação de uma classe generica da mesma forma como instanciando um metodo comum, porém no lugar de passar o valor do parâmetro nós passamos o tipo desse parâmetro.

Para instanciar podemos usar o _`new`_ normalmente como de costume, mas incluímos o tipo _`<Integer>`_ entre o nome da classe e o construtor.
```java
Impressora<Integer> impressora = new Impressora<Integer>();
