package br.com.ada.pooii.aula08.exercicio_aula6;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private BigDecimal amount;
    private String stock;
    private LocalDateTime created;

    public Transaction(BigDecimal amount, String stock) {
        this.amount = amount;
        this.stock = stock;
        this.created = LocalDateTime.now();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getStock() {
        return stock;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", stock='" + stock + '\'' +
                ", created=" + created +
                '}';
    }
}
