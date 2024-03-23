package clase.Factory;

import clase.Atacant;
import clase.Jucator;

public class FabricaAtacant implements FabricaJucator{

    @Override
    public Jucator afisezaTipJucator(String nume) {
        return new Atacant(nume);
    }
}
