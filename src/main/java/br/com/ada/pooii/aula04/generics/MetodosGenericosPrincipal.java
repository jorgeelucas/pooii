package br.com.ada.pooii.aula04.generics;

import java.util.Arrays;
import java.util.List;

public class MetodosGenericosPrincipal {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3);
        Util.swapElementos(lista, 0, 1);

        Integer maior = Util.encontrarMaiorElemento(lista);

        System.out.println(lista);
        System.out.println("Maior: " + maior);

        // testando com string

        List<String> nomes = Arrays.asList("maria", "ana", "erica", "bruna", "paula");

        Util.swapElementos(nomes, 0, nomes.size() - 1);

        String nome = Util.encontrarMaiorElemento(nomes);

        System.out.println(nomes);
        System.out.println("ultima: " + nome);

        List<Animal> animais = Arrays.asList(
                new Animal("cavalo", 1.4),
                new Animal("cachorro", 0.6),
                new Animal("elefante", 2.05),
                new Animal("girafa", 3.4));

        Animal maiorAnimal = Util.encontrarMaiorElemento(animais);

        System.out.println("Maior animal: " + maiorAnimal.nome());
    }


}
