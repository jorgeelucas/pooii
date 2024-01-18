package br.com.ada.pooii.aula05.solid;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // OSP, LSP

        List<String> lista = new LinkedList<>();

        // buscar pelo index

        imprimirElementos(new LinkedList<>());

    }

    public static void imprimirElementos(List<String> lista) {
        String s = lista.get(1);
        for (String string : lista)
            System.out.println(string);
    }
}
