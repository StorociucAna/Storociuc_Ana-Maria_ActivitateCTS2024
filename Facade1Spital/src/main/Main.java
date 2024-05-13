package main;

import clase.Medic;
import clase.ModulInternare;
import clase.Pacient;
import clase.Salon;

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
        Salon salon = new Salon(2);

        ModulInternare modulInternare = new ModulInternare(medic, salon);

        Pacient pacient = new Pacient("Ion", "grav");

        boolean internareReusita = modulInternare.efectueazaInternare(pacient);
        if (internareReusita) {
            System.out.println("Internarea a fost realizată cu succes.");
        } else {
            System.out.println("Internarea nu a putut fi realizată.");
        }
    }

}
