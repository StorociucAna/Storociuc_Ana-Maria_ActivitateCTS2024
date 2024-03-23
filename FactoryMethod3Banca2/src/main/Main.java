package main;

import clase.Client;
import clase.Factory.FabricaClient;
import clase.Factory.FabricaPersoanaFizica;
import clase.Factory.FabricaPersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        FabricaClient fabricaClientPersoanaFizica = new FabricaPersoanaFizica();
        FabricaClient fabricaClientPersoanaJuridica = new FabricaPersoanaJuridica();

        Client persoanaFizica = fabricaClientPersoanaFizica.creeazaClient("Ion Cristian", "Bucuresti");
        Client persoanaJuridica = fabricaClientPersoanaJuridica.creeazaClient("Radu Marian", "Dambovita");

        persoanaJuridica.afiseazaDetalii();
        persoanaFizica.afiseazaDetalii();

    }
}
