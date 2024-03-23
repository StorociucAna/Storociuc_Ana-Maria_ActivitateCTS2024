package clase.Factory;

import clase.Supa;
import clase.SupaDeVita;

public class FabricaSupaDeVita implements FabricaSupa{
    @Override
    public Supa preparaSupa(String nume, int numarIngrediente) {
        return new SupaDeVita(nume, numarIngrediente);
    }
}
