package main;

import clase.Pacient;
import clase.Spital;

public class Main {
    public static void main(String[] args) {
        Spital spital = new Spital();

        Pacient pacient1 = new Pacient("Ion");
        Pacient pacient2 = new Pacient("Marian");

        spital.aboneaza(pacient1);
        spital.aboneaza(pacient2);

        spital.apareEpidemie("gripa");
    }
}
