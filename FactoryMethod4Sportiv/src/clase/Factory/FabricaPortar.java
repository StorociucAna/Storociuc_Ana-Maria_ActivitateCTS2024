package clase.Factory;

import clase.Jucator;
import clase.Portar;

public class FabricaPortar implements FabricaJucator {
    @Override
    public Jucator afisezaTipJucator(String nume) {
        return new Portar(nume);
    }
}
