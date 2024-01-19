package br.com.ada.pooii.aula06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaInteiros = Arrays.asList(1,2,3);

        Calculadora.construir(listaInteiros);
    }
}

class Calculadora {
    public static void construir(List<? extends Number> lista) {
    }
}