package main;

import clase.Externat;
import clase.GestiuneStarePacient;
import clase.SubObservatie;

public class Main {
    public static void main(String[] args) {
        GestiuneStarePacient gestiuneStarePacient = new GestiuneStarePacient();
        gestiuneStarePacient.afiseazaStarePacient();

        gestiuneStarePacient.setStare(new SubObservatie());
        gestiuneStarePacient.afiseazaStarePacient();

        gestiuneStarePacient.setStare(new Externat());
        gestiuneStarePacient.afiseazaStarePacient();
    }
}
