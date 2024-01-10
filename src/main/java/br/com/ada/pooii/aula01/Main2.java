package br.com.ada.pooii.aula01;

import br.com.ada.pooii.domain.Gerente;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {


        List<Gerente> gerentes = new ArrayList<>();
//
//        List<String> a = new LinkedList<>();
//        ArrayList<String> b = new ArrayList<>();
        Gerente gerente1 = new Gerente("jorge", 1000);
        Gerente gerente2 = new Gerente("maria", 2000);
        Gerente gerente3 = new Gerente("eduarda", 1500);
        Gerente gerente4 = new Gerente("angela", 3500);
        Gerente gerente5 = new Gerente("gustavo", 1750);

        gerentes.add(gerente1);
        gerentes.add(gerente2);
        gerentes.add(gerente3);
        gerentes.add(gerente4);
        gerentes.add(gerente5);

        Collections.sort(gerentes);

        System.out.println(gerentes);
    }

}
