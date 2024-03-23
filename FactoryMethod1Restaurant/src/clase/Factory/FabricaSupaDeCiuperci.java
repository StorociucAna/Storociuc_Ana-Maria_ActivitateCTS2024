package clase.Factory;

import clase.Supa;
import clase.SupaDeCiuperci;

public class FabricaSupaDeCiuperci implements FabricaSupa{
    @Override
    public Supa preparaSupa(String nume, int numarIngrediente) {
        return new SupaDeCiuperci(nume, numarIngrediente);
    }
}
