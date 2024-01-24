package br.com.ada.pooii.aula08.exercicio_aula6;

import java.util.List;

public class TransactionManager {

    private final List<? extends RuleChecker> rules;
//    private final OracleDBImplRepository repository;

    public TransactionManager(List<? extends RuleChecker> rules) {
        this.rules = rules;
    }

    void executeTrade(Transaction transaction) {

        for (RuleChecker rule : rules) {
            rule.check(transaction);
        }

        transact(transaction);
    }

    private void transact(Transaction transaction) {
        System.out.println("Transaction succeed: " + transaction);
    }

}
