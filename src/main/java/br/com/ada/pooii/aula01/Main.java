package br.com.ada.pooii.aula01;

import br.com.ada.pooii.domain.Gerente;
import br.com.ada.pooii.domain.Vendedor;

public class Main {
    public static void main(String[] args) {

        // checked and unchecked exceptions in java

        Vendedor vendedor = new Vendedor("igor", 1000);
        Gerente gerente = new Gerente("maria", 2000);

        autentica(vendedor, vendedor.getSenha());
//        autentica(funcionario2, "123");

        System.out.println("Imprimindo o bonus do jorge: " + vendedor.getBonus());
        System.out.println("Imprimindo o bonus da maria: " + gerente.getBonus());
    }

    public static void autentica(Autentica a, String senha) {

        a.autenticaDefault(senha);

        if (a.autentica(senha)) {
            System.out.println("Autenticado");
        } else {
            System.out.println("Nao autenticado");
        }
    }
}