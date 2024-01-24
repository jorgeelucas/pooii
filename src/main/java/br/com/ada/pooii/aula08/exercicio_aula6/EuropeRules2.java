package br.com.ada.pooii.aula08.exercicio_aula6;

public class EuropeRules2 implements EuropeRuleChecker {

    @Override
    public void check(Transaction transaction) {
        if (!transaction.getStock().startsWith("X"))
            throw new RuntimeException("rule checker exception: invalid stock");
    }
}
