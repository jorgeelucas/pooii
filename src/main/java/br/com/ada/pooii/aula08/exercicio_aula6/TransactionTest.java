package br.com.ada.pooii.aula08.exercicio_aula6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransactionTest {
    public static void main(String[] args) {

        List<RuleChecker> rules = new ArrayList<>();
        rules.add(new DailyLimitRule());
        rules.add(new AfterWorkingHoursRule(17));

        List<EuropeRuleChecker> europeRules = new ArrayList<>();
        europeRules.add(new EuropeRules1());
        europeRules.add(new EuropeRules2());

        TransactionManager manager = new TransactionManager(rules);

        var t1 = new Transaction(new BigDecimal("301"), "XADA");

        manager.executeTrade(t1);

    }
}
