package clase.Factory;

import clase.Fundas;
import clase.Jucator;

public class FabricaFundas implements FabricaJucator {
    @Override
    public Jucator afisezaTipJucator(String nume) {
        return new Fundas(nume);
    }
}
