package clase.Factory;

import clase.CategoriaBody;
import clase.Medicament;

public class FabricaMedBody implements FabricaMedicament{
    @Override
    public Medicament creeazaMedicament(String denumire, int pret) {
        return new CategoriaBody(denumire, pret);
    }
}
