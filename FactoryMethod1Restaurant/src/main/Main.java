package main;

import clase.Factory.FabricaSupa;
import clase.Factory.FabricaSupaDeCiuperci;
import clase.Factory.FabricaSupaDeLegume;
import clase.Factory.FabricaSupaDeVita;
import clase.Supa;

public class Main {
    public static void prelucrareSupa(FabricaSupa fabricaSupa, String nume, int numarIngrediente){
        Supa supa =fabricaSupa.preparaSupa(nume,numarIngrediente);
        supa.afiseazaDetalii();
    }
    public static void main(String[] args) {
        FabricaSupa fabricaSupaCiuperci = new FabricaSupaDeCiuperci();
        FabricaSupa fabricaSupaLegume = new FabricaSupaDeLegume();
        FabricaSupa fabricaSupaVita = new FabricaSupaDeVita();

        Supa supaCiuperci = fabricaSupaCiuperci.preparaSupa("ciuperci", 15);
        Supa supaLegume = fabricaSupaLegume.preparaSupa("legume", 20);
        Supa supaVita = fabricaSupaVita.preparaSupa("vita", 20);

        supaCiuperci.afiseazaDetalii();
        supaLegume.afiseazaDetalii();
        supaVita.afiseazaDetalii();

        prelucrareSupa(new FabricaSupaDeVita(), "vita", 15);
    }
}
