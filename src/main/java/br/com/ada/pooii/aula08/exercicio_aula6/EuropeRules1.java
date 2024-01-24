package br.com.ada.pooii.aula08.exercicio_aula6;

import java.math.BigDecimal;

public class EuropeRules1 implements EuropeRuleChecker {
    @Override
    public void check(Transaction transaction) {
        if (transaction.getAmount().compareTo(new BigDecimal("300")) < 0)
            throw new RuntimeException("rule checker exception: min limit for european people");
    }
}
