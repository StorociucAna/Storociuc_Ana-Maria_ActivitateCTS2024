package main;

import clase.BuilderRezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new BuilderRezervare()
                .setMuzicaAmbientalaPersonalizata(true)
                .setAșezareLaGeam(true)
                .setDecorareaMesei(false)
                .setScauneErgonomice(false)
                .setGenMuzica("jazz")
                .build();
        Rezervare rezervare1 = new BuilderRezervare().setAșezareLaGeam(false).build();

        System.out.println(rezervare);
        System.out.println(rezervare1);

    }
}
