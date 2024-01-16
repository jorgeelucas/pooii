package br.com.ada.pooii.aula04.generics;

import java.util.List;

public class Util {

    public static int contarCaracteres(String txt) {
        return txt != null
            ? txt.trim().length()
            : 0;
    }

    public static <T> void swapElementos(List<T> lista, int de, int para) {
        // omitindo validacoes

        // salvando elementos temporariamente
        T elementoDe = lista.get(de);
        T elementoPara = lista.get(para);

        // swapping elements
        lista.set(de, elementoPara);
        lista.set(para, elementoDe);
    }

    public static <T extends Comparable<T>> T encontrarMaiorElemento(List<T> lista) {
        // poderiamos ainda adicionar mais restricoes com: <T extends Number & Comparable<T>>
        if (lista.isEmpty()) {
            return null;
        }

        T maiorElemento = lista.get(0);

        for (T elemento: lista) {
            if (elemento.compareTo(maiorElemento) > 0) {
                maiorElemento = elemento;
            }
        }

        return maiorElemento;
    }

}
