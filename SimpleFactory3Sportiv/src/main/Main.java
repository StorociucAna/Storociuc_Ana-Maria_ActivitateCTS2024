package main;

import clase.Factory.FactoryJucator;
import clase.Factory.TipJucator;
import clase.Jucator;

public class Main {
    public static void main(String[] args) {
        FactoryJucator fabricaJucator = new FactoryJucator();
        try{
            Jucator atacant = fabricaJucator.afiseazaTipJucator(TipJucator.ATACANT, "Marian");
            Jucator fundas = fabricaJucator.afiseazaTipJucator(TipJucator.FUNDAS, "Cristian");
            Jucator portar = fabricaJucator.afiseazaTipJucator(TipJucator.PORTAR, "Ion");
            atacant.afisezaDetalii();
            fundas.afisezaDetalii();
            portar.afisezaDetalii();
        }
        catch (Exception e){
           throw new RuntimeException();
        }
    }
}
