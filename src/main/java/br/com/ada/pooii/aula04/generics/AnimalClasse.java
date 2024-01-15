package br.com.ada.pooii.aula04.generics;

public class AnimalClasse {

    private final String nome;
    private final int idade;

    public AnimalClasse(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String nome() {
        return nome;
    }

    public int idade() {
        return idade;
    }
}
