package org.java.eventi.gestore;

import java.time.LocalDate;

public class Evento {

    // attributi

    private String titolo;
    private LocalDate data;
    private int postiTotali;
    private int postiRiservati;

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
        this.postiRiservati = 0;
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

    public int getPostiRiservati() {
        return postiRiservati;
    }

// metodi

    public int postiDisponibili(){
        return postiTotali - postiRiservati;
    }

    public void postiRiservati (int numeroPosti) throws RuntimeException{

        if (numeroPosti > postiDisponibili()) {
            throw new RuntimeException("Posti non Disponibili!");
        }
        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException("data non valida!");
        }

        postiRiservati = postiRiservati + numeroPosti;

    }

    public void disdici (int numeroPosti) throws RuntimeException{

        if (postiRiservati < numeroPosti){
            throw new RuntimeException("Posti da disdire non diponibili!");
        }
        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException("data non valida!");
        }

        postiRiservati = postiRiservati - numeroPosti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "titolo='" + titolo + '\'' +
                ", data=" + data +
                ", postiTotali=" + postiTotali +
                ", postiDisponibili=" + postiRiservati +
                '}';
    }
}
