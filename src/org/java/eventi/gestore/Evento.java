package org.java.eventi.gestore;

import java.time.LocalDate;

public class Evento {

    // attributi

    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiDisponibili;

    // costruttore

    public Evento(String titolo, LocalDate data, int postiTotali) throws RuntimeException {

        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException("La data non deve essere nel passato!");
        }

        if (postiTotali < 0 || postiTotali >1000){
            throw new RuntimeException("Posti non disponibili o valore negativo!");
        }


        this.titolo = titolo;
        this.data = data;
        this.postiTotali = postiTotali;
        this.postiDisponibili = 0;
    }


    // getter setter

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getPostiTotali() {
        return postiTotali;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

// metodi

    public

    @Override
    public String toString() {
        return "Evento{" +
                "titolo='" + titolo + '\'' +
                ", data=" + data +
                ", postiTotali=" + postiTotali +
                ", postiDisponibili=" + postiDisponibili +
                '}';
    }
}
