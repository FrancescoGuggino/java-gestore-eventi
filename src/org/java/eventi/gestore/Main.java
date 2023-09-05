package org.java.eventi.gestore;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci nome evento: ");
        String titoloEvento = scanner.nextLine();
        System.out.println("Data evento: ");
        String dataEvento = scanner.nextLine();
        System.out.println("Numero posti totali: ");
        int postiTotali = scanner.nextInt();


        try {

            Evento evento = new Evento(titoloEvento,LocalDate.parse(dataEvento),postiTotali);
            System.out.println("Titolo: " + evento.getTitolo());
            System.out.println("Data: " + evento.getData());
            System.out.println("Posti totali: " + evento.getPostiTotali());
            System.out.println("Posti prenotati: " + evento.getPostiRiservati());

            System.out.println("Quanti posti vuoi prenotare ?");
            int postiRiservati = scanner.nextInt();
            evento.postiRiservati(postiRiservati);

        } catch (RuntimeException exception){
            System.out.println("Errore!");
            System.out.println(exception.getMessage());
        }
    }
}
