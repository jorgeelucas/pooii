package br.com.ada.pooii.aula08;

public class Main {
    public static void main(String[] args) {

        // SRP
        // Transaction manager: parou de gerencias as regras

        // OCP
        // Transaction manager: aberta para novas regras e fechada para modificacao

        // LSP
        // Transaction manager: podemos substituir RuleChecker por qualquer implementacao

        // ISP
        // RuleChecker: recebeu uma segregacao quando precisamos de outro grupo de regras

        // DIP
        // Transaction manager: agora depende uma lista de abstracoes e nao implementacoes

    }
}
