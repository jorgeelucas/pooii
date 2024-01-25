package br.com.ada.pooii.aula08.exercicio;

public class EconomicPrinter implements Economic {

    @Override
    public void print(String msg) {
        System.out.println("printing... " + msg);
    }

    @Override
    public void copy(String msg) {
        System.out.println("copying... "+msg);
    }

}
