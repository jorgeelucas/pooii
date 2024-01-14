_Este é o meu resumo sobre o conceito de `Casting` do Java._

# Trabalhando com Casting em Java

Em Java, usamos o conceito de _`Casting`_ quando desejamos converter um tipo de dado em outro tipo. Existem dois tipos de Casting: o Implícito e o Explícito.

## Casting implicito

O Casting implícito ocorre quando o próprio Java realiza a conversão automaticamente. Por exemplo:

**_Declarando e atribuindo variaveis_**
```java

int numeroInteiro = 123;
long numeroLongo = numeroInteiro;

// imprimindo o valor de numeroLong
System.out.println(numeroLongo); // 123

```


Neste caso, o Java identifica que é possível converter um número inteiro (32 bits) em um número longo (64 bits) sem perda de dados.

Muitas vezes utilizamos `Casting` implícito sem perceber quando fazemos o seguinte:

**_Declarando uma variável_**
```java
long numero = 123;
```

Isso ocorre porque quando declaramos um valor literal, como 123, o Java o interpreta como um inteiro. Se quisermos declará-lo como long, devemos incluir a letra L ao final do número, como no exemplo a seguir:

**_Casting Implícito com Objetos_**

Ocorre quando uma classe filha é automaticamente tratada como sua superclasse, sem a necessidade de uma conversão explícita. Vejamos o exemplos das classes `"Animal"` e a classe filha `"Gato"`.:

```java
class Animal {}
class Gato extends Animal {}

// metodo main
Animal animal = new Gato();
```

Neste exemplo, a classe `"Gato"` é uma subclasse de `"Animal"`, e o Java permite que façamos o _Casting_ implícito, tratando o objeto `"animal"` como um objeto da superclasse `"Animal"`.

> _No entanto, é importante observar que, ao usar o Casting implícito, só podemos acessar os membros da superclasse `"Animal"`. Se quisermos acessar os membros específicos da classe `"Gato"`, precisaríamos realizar um Casting explícito, como mencionado abaixo._

_O Casting implícito é útil quando se deseja trabalhar com várias classes filhas de uma mesma superclasse de forma mais genérica._

### Casting Explícito

O Casting explícito ocorre quando precisamos realizar uma conversão que não é feita automaticamente pelo Java e há potencial de perda de dados.

Para realizar o Casting explícito, utilizamos a sintaxe `(tipoDestino) valor`, onde `tipoDestino` é o tipo para o qual desejamos converter o valor. Por exemplo:

**_Transformando um valor do tipo `double` em `int` ciente da perda de dados_**
```java
double numeroDecimal = 123.45;
int numeroInteiro = (int) numeroDecimal;
System.out.println(numeroInteiro); // 123
```

Neste caso, estamos convertendo explicitamente um número decimal em um número inteiro, e a parte decimal é truncada, resultando em perda de informações.

> É importante usar o Casting explícito com cautela, garantindo que a conversão seja apropriada para o contexto e que não cause perdas indesejadas de dados.
