package br.com.ada.pooii.aula06.exercicio.exercicio2;

import java.math.BigDecimal;

public class TransactionTest {
    public static void main(String[] args) {

        TransactionManager manager = new TransactionManager();

        var t1 = new Transaction(new BigDecimal("1000"), "ADA");

        manager.executeTrade(t1);

    }
}
