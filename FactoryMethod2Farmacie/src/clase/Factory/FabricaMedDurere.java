package clase.Factory;

import clase.CategoriaDurere;
import clase.Medicament;

public class FabricaMedDurere implements FabricaMedicament{
    @Override
    public Medicament creeazaMedicament(String denumire, int pret) {
        return new CategoriaDurere(denumire, pret);
    }
}
