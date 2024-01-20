package br.com.ada.pooii.aula06;

public class Diretor extends Funcionario {

    public Diretor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.8;
    }
}
