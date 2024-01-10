### Exercício 1: Implementação da Interface "Veículo"

Crie uma Interface chamada "Veículo" com os seguintes métodos:

```java
public interface Veiculo {
    void ligar();
    void desligar();
    void acelerar(int velocidade);
    void frear();
}

```

Agora, sua tarefa é criar três classes concretas que implementem a Interface "Veículo": "Carro", "Moto" e "Bicicleta". Cada classe deve implementar os métodos da Interface de maneira apropriada para o tipo de veículo.

Depois de implementar as classes, crie objetos de cada classe e demonstre como os métodos podem ser chamados de maneira polimórfica. Certifique-se de representar esses comportamentos em suas implementações.



**Exercício 2: Implementação de uma Interface "Shape" (Forma Geométrica)**

```java
public interface Shape {
    double calcularÁrea();
}
```

Agora, sua tarefa é criar três classes concretas que implementem a Interface "Shape": "Círculo", "Retângulo" e "Triângulo". Cada classe deve implementar o método "calcularÁrea()" de acordo com as fórmulas correspondentes à forma geométrica.

Depois de implementar as classes, crie objetos de cada classe e calcule as áreas usando os métodos implementados.