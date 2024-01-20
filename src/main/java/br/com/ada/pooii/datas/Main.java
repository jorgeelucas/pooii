package br.com.ada.pooii.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // formas de receber uma string e converter para um objeto de datas

        // trabalhando com DATE
        String data = "19/01/2024";
        Date date = new Date(2024, 0, 19);

        System.out.println(date);

        // trabalhando com LocalDate ou LocalDateTime
        LocalDate localDate = LocalDate.parse("2024-01-19"); // formato ISO

        System.out.println(localDate);

        System.out.print("Informe a data: ");
        String dataInformada = "19/01/2024";

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // meu formato
        LocalDate ld2 = LocalDate.parse(dataInformada, formatador); // ensinando a localDate meu formato

        System.out.println(ld2); // sera impresso em ISO pois eu so ensinei a receber no meu formato

        // imprimindo
        String dataFormatada = ld2.format(formatador); // retornando a data no meu formato
        System.out.println("Data formatada: " + dataFormatada);
    }
}
