package clase.Factory;

import clase.Supa;
import clase.SupaDeLegume;

public class FabricaSupaDeLegume implements FabricaSupa{
    @Override
    public Supa preparaSupa(String nume, int numarIngrediente) {
        return new SupaDeLegume(nume, numarIngrediente);
    }
}
