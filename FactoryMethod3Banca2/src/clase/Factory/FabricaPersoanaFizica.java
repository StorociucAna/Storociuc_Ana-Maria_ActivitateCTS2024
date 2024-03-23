package clase.Factory;

import clase.Client;
import clase.PersoanaFizica;

public class FabricaPersoanaFizica implements FabricaClient{
    @Override
    public Client creeazaClient(String nume, String adresa) {
        return new PersoanaFizica(nume, adresa);
    }
}
