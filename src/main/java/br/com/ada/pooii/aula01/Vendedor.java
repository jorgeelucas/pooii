package br.com.ada.pooii.aula01;

public class Vendedor extends Funcionario implements Autentica {

    private String senha;

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.salario * 0.2;
    }

    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }

    public String getSenha() {
        return senha;
    }
}
