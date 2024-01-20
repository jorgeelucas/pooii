package br.com.ada.pooii.aula06.exercicio.exercicio2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionManager {

    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1000");

    void executeTrade(Transaction transaction) {

        // executar transacao

        // add new rule to validate min value per transaction
        // verify if stock is available for trading

        if (transaction.getAmount().compareTo(MAX_DAILY_LIMIT) > 0) {
            throw new RuntimeException("invalid transaction: max limit");
        }

        if (isAfterWorkingHours(transaction)) {
            throw new RuntimeException("invalid transaction: after working hours");
        }

        transact(transaction);
    }

    private void transact(Transaction transaction) {
        System.out.println("Transaction succeed: " + transaction);
    }

    private boolean isAfterWorkingHours(Transaction transaction) {
        // logica para verificar a hora
        LocalDateTime limit =
                LocalDateTime.of(2024,1,19,22,0,0);
        return transaction.getCreated().isAfter(limit);
    }

}
