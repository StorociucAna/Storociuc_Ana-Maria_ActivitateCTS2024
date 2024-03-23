package main;

import clase.Factory.FabricaAtacant;
import clase.Factory.FabricaFundas;
import clase.Factory.FabricaJucator;
import clase.Factory.FabricaPortar;
import clase.Jucator;

public class Main {
    public static void afiseazaTipJucator(FabricaJucator fabricaJucator, String nume){
        Jucator jucator = fabricaJucator.afisezaTipJucator(nume);
        jucator.afiseazaDetalii();
    }
    public static void main(String[] args) {
        FabricaJucator fabricaAtacant = new FabricaAtacant();
        FabricaJucator fabricaFundas = new FabricaFundas();
        FabricaJucator fabricaPortar = new FabricaPortar();
        Jucator atacant = fabricaAtacant.afisezaTipJucator("Ion");
        Jucator fundas = fabricaFundas.afisezaTipJucator("Marian");
        Jucator portar = fabricaPortar.afisezaTipJucator("Cristian");
        atacant.afiseazaDetalii();
        fundas.afiseazaDetalii();
        portar.afiseazaDetalii();

        afiseazaTipJucator(fabricaAtacant, "Andrei");
    }
}
