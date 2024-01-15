package br.com.ada.pooii.aula04.casting;

public class Principal {

    public static void main(String[] args) {


        // casting implicito
        Integer inteiro = 123;
        Number numero = inteiro;

        // casting explicito

        // byte  (8 bits)   = -128 ate 127
        // short (16 bits) = -32_768 ate 32_767
        // int   (32 bits) = -2_147_483_648 ate 2_147_483_647
        // long  (64 bits) = -9_223_372_036_854_775_808 a 9_223_372_036_854_775_807

        short st = 1000;
        byte bt = (byte) st;

        System.out.println(bt);

//        long longo = 123l;
//        int num = (int) longo;

        int dataNascimento = 1980;
        short curto = (short) dataNascimento;

        long idadeFuncionario = 30;
        int idadeEmInt = (int) idadeFuncionario;


        // double, float = .00
        double salario = 1299.99;
        float salarioFt = 1299.99f;

        int salarioInt = (int) salarioFt;
        System.out.println(salarioInt);

        long numeroLongo = 123L;

        double resultado = 22.10 + 5;
        System.out.println("resultado: "+resultado);

        int resultado2 = (int) 22.10 + 5;
        System.out.println("Resultado2 " + resultado2);

    }

}
