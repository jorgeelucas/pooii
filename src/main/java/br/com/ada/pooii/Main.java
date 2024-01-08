package br.com.ada.pooii;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("jorge", 1000, "veNdeDor");
        Funcionario funcionario2 = new Funcionario("maria", 2000, "geRentE");

        System.out.println("Imprimindo o bonus do jorge: " + funcionario1.getBonus());
        System.out.println("Imprimindo o bonus da maria: " + funcionario2.getBonus());
    }
}

class Funcionario {

    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getBonus() {
        double resultado = 0.0;

        if (this.cargo.equals("vendedor")) {
            resultado = this.salario * 0.2;
        } else if(this.cargo.equals("gerente")) {
            resultado = this.salario * 0.3;
        }

        return resultado;
    }
}