package br.com.ada.pooii.aula08.exercicio_aula6;

import java.time.LocalDateTime;

public class AfterWorkingHoursRule implements RuleChecker {

    private final int horario;

    public AfterWorkingHoursRule(int horario) {
        this.horario = horario;
    }

    @Override
    public void check(Transaction transaction) {
        if (isAfterWorkingHours(transaction))
            throw new RuntimeException("After working hours: " + transaction);
    }

    private boolean isAfterWorkingHours(Transaction transaction) {
        // logica para verificar a hora
        LocalDateTime limit =
                LocalDateTime.of(2024,1,24,horario,0,0);
        return transaction.getCreated().isAfter(limit);
    }
}
