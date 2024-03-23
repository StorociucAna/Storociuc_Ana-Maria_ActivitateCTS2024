package main;

import clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz= Autobuz.getInstance("Autobuz", 50);
        Autobuz autobuz2 = Autobuz.getInstance("2Autobuz", 60);
        autobuz.afiseazaDetalii();
        autobuz2.afiseazaDetalii();
    }
}
