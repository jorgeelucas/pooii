package br.com.ada.pooii.aula04.generics;

public record Animal(String nome, double tamanho) implements Comparable<Animal> {

    @Override
    public int compareTo(Animal o) {
        if (o.nome.length() > this.nome.length()) return -1;
        else if (o.nome.length() == this.nome.length()) return 0;
        else return 1;
    }

}
