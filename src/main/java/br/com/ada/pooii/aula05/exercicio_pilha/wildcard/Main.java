package br.com.ada.pooii.aula05.exercicio_pilha.wildcard;

import br.com.ada.pooii.aula05.exercicio_pilha.Stack;
import br.com.ada.pooii.aula05.exercicio_pilha.StackImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Stack<Potro> animaisStack = new StackImpl<>();

        animaisStack.push(new Potro());
        animaisStack.push(new Potro());
        animaisStack.push(new Potro());
        animaisStack.push(new Potro());
        animaisStack.push(new Potro());

        List<Animal> lista = new ArrayList<>();

        animaisStack.transferirObjetos(lista);

        System.out.println(lista);

    }
}
