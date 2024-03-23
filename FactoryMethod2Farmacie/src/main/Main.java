package main;

import clase.Factory.FabricaMedBody;
import clase.Factory.FabricaMedDurere;
import clase.Factory.FabricaMedRaceala;
import clase.Factory.FabricaMedicament;
import clase.Medicament;

public class Main {
    public static void initializeazaMedicament(FabricaMedicament fabricaMedicament, String denumire, int pret){
        Medicament medicament = fabricaMedicament.creeazaMedicament(denumire, pret);
        medicament.afiseazaDetalii();
    }
    public static void main(String[] args) {
        FabricaMedicament fabricaMedBody = new FabricaMedBody();
        FabricaMedicament fabricaMedDurere = new FabricaMedDurere();
        FabricaMedicament fabricaMedRaceala = new FabricaMedRaceala();

        Medicament medicamentBody = fabricaMedBody.creeazaMedicament("Vitamina C", 20);
        Medicament medicamentDurere = fabricaMedDurere.creeazaMedicament("Ibuprofen", 15);
        Medicament medicamentRaceala = fabricaMedRaceala.creeazaMedicament("Paracetamol", 10);

        medicamentBody.afiseazaDetalii();
        medicamentDurere.afiseazaDetalii();
        medicamentRaceala.afiseazaDetalii();

        initializeazaMedicament(new FabricaMedRaceala(),"Parasinus", 15);
    }
}
