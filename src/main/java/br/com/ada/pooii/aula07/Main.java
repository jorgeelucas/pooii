package br.com.ada.pooii.aula07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("string");


        // Liskov substitution principle
        Pardal pardal = new Pardal();

        Galinha galinha = new Galinha();

        fazerAveVoar(pardal);

    }

    public static void fazerAveVoar(AveVoadoras ave) {
        ave.comer();
        ave.voar();
    }
}

interface AveVoadoras extends Ave {
    void voar();
}

interface Ave {
    void comer();
}

class Galinha implements Ave {

    @Override
    public void comer() {
        System.out.println("galinha comendo...");
    }
}

class Pardal implements AveVoadoras {

    @Override
    public void voar() {
        System.out.println("Pardal voando...");
    }

    @Override
    public void comer() {
        System.out.println("Pardal comendo...");
    }
}