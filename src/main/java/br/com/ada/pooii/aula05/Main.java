package br.com.ada.pooii.aula05;

public class Main {
    public static void main(String[] args) {
        imprimirClasse(String.class);
    }

    public static <T> void imprimirClasse(Class<T> classe) {
        System.out.println(classe);
    }
}