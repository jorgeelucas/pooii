_Este é o meu resumo sobre o conceito de `Casting` do Java._

# Trabalhando com Casting em Java

Em Java, usamos o conceito de _`Casting`_ quando desejamos converter um tipo de dado em outro tipo. Existem dois tipos de Casting: o Implícito e o Explícito.

## Casting implícito

> O Casting implícito ocorre quando o próprio Java realiza a conversão automaticamente.


**_Exemplo_**
```java

double d1 = 4; // int -> double
double d2 = 5.7f; // float -> double
long l1 = 100; // int -> long

```

Nesse exemplo, não precisamos informar ao Java sobre o _casting_ porque não há perda de dados ou precisão pois:
* O tamanho de um _`double`_ é maior que _`int`_
* O tamanho de um _`double`_ é maior que _`float`_
* O tamanho de um _`long`_ é maior que um _`int`_
* 

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

**_Transformando um valor do tipo em outro tipo primitivo_**
```java
//Conversão do double 5.0 para float.
float a  = (float) 5.0;
System.out.println(a); // 5.0

//Conversão de double para int.
int b = (int) 5.1987;
System.out.println(b);

//Conversão de int para float é implícito, não precisa de casting.
float c = 100;
System.out.println(c); // 100.0

//Conversão de char para int é implícito, não precisa de casting.
int d = 'd';
System.out.println(d); // 100
```

No caso do _`double`_ para _`int`_, estamos convertendo explicitamente um número **decimal** em um número **inteiro**, e a parte decimal é truncada (perdida), resultando em perda de informações e o valor de b vai ser 5

> É importante usar o Casting explícito com cautela, garantindo que a conversão seja apropriada para o contexto e que não cause perdas indesejadas de dados.

### Casting automáticos

Quando fazer uma simples operação como:

```java
double resultado = 32.5 + 8; // 40.5
```

O Java vai, automáticamente, fazer o casting do segundo parametro (8) para double pois toda operação aritmética deve ser feita em valores do mesmo tipo;

* **32.5 + 8.0** vai ser calculado e salvo em `resultado`

```java
double resultado = 32.5 + (double) 8;
```

