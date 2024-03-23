package main;

import clase.Rezervare;
import clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new RezervareBuilder()
                .setMâncareInclusa(true)
                .setScaunErgonomic(false)
                .setBauturaRacoritoareInclusa(true)
                .setMuzicaAmbientala(true)
                .setGenMuzica("Pop")
                .build();
        System.out.println(rezervare);
    }
}
