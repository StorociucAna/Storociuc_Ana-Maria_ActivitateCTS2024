package clase.Factory;

import clase.Supa;
import clase.SupaCiuperci;
import clase.SupaLegume;
import clase.SupaVita;

public class FabricaSupa {
    public Supa preparaSupa(TipSupa tipSupa, String denumire, int numarIngrediente) throws Exception{
        switch(tipSupa){
            case LEGUME:
                Supa supaLegume = new SupaLegume(denumire, numarIngrediente);
                return supaLegume;
            case CIUPERCI:
                Supa supaCiuperci = new SupaCiuperci(denumire, numarIngrediente);
                return supaCiuperci;
            case VITA:
                Supa supaVita = new SupaVita(denumire, numarIngrediente);
                return supaVita;
            default:
                throw new IllegalArgumentException("unknonw tipSupa: " + tipSupa);
        }
    }
}
