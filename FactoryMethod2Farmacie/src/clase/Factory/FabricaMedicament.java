package clase.Factory;

import clase.Medicament;

public interface FabricaMedicament {
    public Medicament creeazaMedicament(String denumire, int pret);
}
