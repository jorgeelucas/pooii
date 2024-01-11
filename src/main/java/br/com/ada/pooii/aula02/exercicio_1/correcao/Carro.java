package br.com.ada.pooii.aula02.exercicio_1.correcao;

public class Carro implements VeiculoMotorizado {

    @Override
    public void ligar() {
        System.out.println("ligando o carro");
    }

    @Override
    public void desligar() {
        System.out.println("desligando o carro");
    }

    @Override
    public void acelerar(int velocidade) {
        if (velocidade <= getVelocidadeMaximaPermitida()) {
            System.out.println("acelerando o carro com a velocidade: " + velocidade);
        } else {
            System.out.println("Velocidade nao permitida");
        }
    }

    @Override
    public void frear() {
        System.out.println("freando o carro");
    }

    @Override
    public Integer getVelocidadeMaximaPermitida() {
        return 230;
    }
}
