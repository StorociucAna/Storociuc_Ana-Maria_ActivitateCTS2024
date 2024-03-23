package main;

import clase.Factory.FabricaSupa;
import clase.Factory.TipSupa;
import clase.Supa;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupa = new FabricaSupa();
        try{
            Supa supaDeLegume = fabricaSupa.preparaSupa(TipSupa.LEGUME, "Supa de legume", 15);
            Supa supaDeCiuperci = fabricaSupa.preparaSupa(TipSupa.CIUPERCI, "Supa de ciuperci", 20);
            Supa supaDeVita = fabricaSupa.preparaSupa(TipSupa.VITA, "Supa de vita", 15);
            supaDeLegume.afiseazaDetalii();
            supaDeCiuperci.afiseazaDetalii();
            supaDeVita.afiseazaDetalii();

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
