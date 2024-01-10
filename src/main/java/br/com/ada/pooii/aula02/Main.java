package br.com.ada.pooii.aula02;

import br.com.ada.pooii.domain.Vendedor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("jorge", 1200);

        Integer ano = null;

        if (vendedor.getNome().equals("jorge")) {
            ano = 1994;
        } else if (vendedor.getNome().equals("roberto")) {
            ano = 1997;
        }

        // unchecked exception
        if (ano != null) {
            System.out.println("Ano de nascimento: " + ano.toString());
        }

        // checked exception
        try {

            Files.readAllBytes(Path.of(""));

        } catch (IOException e) {
            // cria o arquivo
            e.printStackTrace();
        }


    }
}
