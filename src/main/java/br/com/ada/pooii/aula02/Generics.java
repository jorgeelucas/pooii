package br.com.ada.pooii.aula02;

import br.com.ada.pooii.aula02.exercicio_1.Caixa;
import br.com.ada.pooii.domain.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String args[]) {

        // Generics

        Caixa<String> box = new Caixa<>("abc"); // diamond
        Caixa<Integer> caixaDeInteger = new Caixa<>(1);

        String resultadoCaixaDaString = box.imprimir();
        box.getInt("asdf");

        String resultadoCaixaDoInteger = caixaDeInteger.imprimir();
        caixaDeInteger.getInt(123);

        System.out.println(resultadoCaixaDaString);
        System.out.println(resultadoCaixaDoInteger);

        Vendedor vendedor = new Vendedor("jorge", 1200);

        Caixa<Vendedor> caixaVendedor = new Caixa<>(vendedor);
        String string = caixaVendedor.imprimir();
        System.out.println(string);

        List<Vendedor> lista = new ArrayList<>();
        lista.add(new Vendedor("novo", 14000));

        //casting

    }

}
