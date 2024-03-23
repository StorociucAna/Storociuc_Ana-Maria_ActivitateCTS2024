package main;

import clase.Factory.FabricaMedicament;
import clase.Factory.TipCategorieMedicament;
import clase.Medicament;

public class Main {
    public static void main(String[] args) {
        FabricaMedicament fabricaMedicament = new FabricaMedicament();
        try{
            Medicament medicamentBody = fabricaMedicament.creeazaMedicament(TipCategorieMedicament.BODY, "Vitamina C", 20);
            Medicament medicamentDurere = fabricaMedicament.creeazaMedicament(TipCategorieMedicament.DURERE, "Nurofen" , 30);
            Medicament medicamentRaceala = fabricaMedicament.creeazaMedicament(TipCategorieMedicament.RACEALA, "Parasinus", 20);
            medicamentBody.afiseazaDetalii();
            medicamentDurere.afiseazaDetalii();
            medicamentRaceala.afiseazaDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
