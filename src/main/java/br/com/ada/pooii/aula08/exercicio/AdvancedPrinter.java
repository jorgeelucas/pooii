package br.com.ada.pooii.aula08.exercicio;

public class AdvancedPrinter implements Multifunction {

    @Override
    public void print(String msg) {
        System.out.println("printing... " + msg);
    }

    @Override
    public void scan(String msg) {
        System.out.println("scanning... " + msg);
    }

    @Override
    public void fax(String msg) {
        System.out.println("faxing... " + msg);
    }

    @Override
    public void copy(String msg) {
        System.out.println("copying... "+msg);
    }
}
