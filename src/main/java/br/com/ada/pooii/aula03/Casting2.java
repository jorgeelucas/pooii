package br.com.ada.pooii.aula03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Casting2 {

    public static void main(String[] args) {

        List animais = new ArrayList();

        Animal animal = new Animal();

//        Gato gato = (Gato) animal; CLASS CAST EXCEPTION

        Gato gato = new Gato();
        gato.nome = "a";
        gato.cor = "branco";
        animais.add(gato);

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "b";
        cachorro.raca = "vira lata";
        animais.add(cachorro);


//        animais.add("abc"); // CLASS CAST EXCEPTION

        imprimirNomesDosAnimais(animais);


        // CASTING IMPLICITO
        Animal animal1 = gato;

        // WRAPPERS
        // Integer, Double, Long...
        // int    , double, long...

        // boxing
        int a = 1;
        Integer aWrapper = a;

        // unboxing
        Integer b = 1;
        int c = b;
//
//        Long c = 2_000_000_000L;
//
//        int i = c.intValue();

        // NullPointerException
//        Integer d = null;
//        int e = d;
    }

    public static void imprimirNomesDosAnimais(List animais) {
        for (int i = 0 ; i < animais.size() ; i++) {
            // imprimir o nome

            Animal animal; // declarando a variavel

            Object objetoDaPosicaoI = animais.get(i); // pegando o elemento da posicao

            animal = (Animal) objetoDaPosicaoI; // casting: convertendo o elemento

            System.out.println(animal.getNome()); // imprimindo o animal convertido
        }
    }

}

class Animal {
    String nome;

    public String getNome() {
        return nome;
    }
}
class Gato extends Animal {
    String cor;
}
class Cachorro extends Animal {
    String raca;
}