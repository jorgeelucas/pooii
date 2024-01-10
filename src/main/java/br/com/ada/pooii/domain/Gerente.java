package br.com.ada.pooii.domain;

public class Gerente extends Funcionario implements Comparable<Gerente> {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.3;
    }

    @Override
    public int compareTo(Gerente o) {
        return Double.compare(this.getBonus(), o.getBonus());
    }

    @Override
    public String toString() {
        return this.nome + ": salario: " + this.salario + " bonus: " + this.getBonus();
    }
}
