package br.com.ada.pooii.aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Generics {

    public static void main(String[] args) {

        /**
         *
         * E - Element (used extensively by the Java Collections Framework)
         * K - Key
         * N - Number
         * T - Type
         * V - Value
         * S,U,V etc. - 2nd, 3rd, 4th types
         *
         * */

        Gato gato = new Gato();
        gato.nome = "jayz";
        gato.cor = "azul";

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "jilo";
        cachorro.raca = "viralata";

        List<Animal> animais = new ArrayList<>();
        animais.add(gato);
        animais.add(cachorro);

        imprimirNomesDosAnimais(animais);

    }

    public static void imprimirNomesDosAnimais(List<Animal> animais) {
        for (int i = 0 ; i < animais.size() ; i++) {
            Animal animal = animais.get(i);
            System.out.println(animal.getNome());
        }
    }

}
