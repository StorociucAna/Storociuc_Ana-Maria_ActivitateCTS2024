package clase.Factory;

import clase.CategoriaRaceala;
import clase.Medicament;

public class FabricaMedRaceala implements FabricaMedicament{
    @Override
    public Medicament creeazaMedicament(String denumire, int pret) {
        return new CategoriaRaceala(denumire, pret);
    }
}
