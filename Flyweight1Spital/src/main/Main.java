package main;

import clase.FabricaPacient;
import clase.Internare;
import clase.PacientFlyweight;

public class Main {
    public static void main(String[] args) {

        FabricaPacient fabricaPacienti = new FabricaPacient();

        PacientFlyweight pacient1 = fabricaPacienti.getPacient("Ion", "1234567890", "123 Strada Principală");
        PacientFlyweight pacient2 = fabricaPacienti.getPacient("Marian", "0987654321", "456 Strada Secundara");

        Internare internare1 = new Internare(pacient1, 101, 1, 3);
        Internare internare2 = new Internare(pacient2, 102, 2, 5);

        internare1.afiseazaInformatii();
        System.out.println("-------------------------");
        internare2.afiseazaInformatii();
    }
}
