package br.com.ada.pooii.aula02.exercicio_1.correcao;

public class Bicicleta implements Veiculo {

    @Override
    public void acelerar(int velocidade) {
        System.out.println("acelerando a bicicleta");
    }

    @Override
    public void frear() {
        System.out.println("freando a bicicleta");
    }
}
