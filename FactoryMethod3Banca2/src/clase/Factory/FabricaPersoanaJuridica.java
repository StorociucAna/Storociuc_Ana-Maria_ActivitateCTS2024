package clase.Factory;

import clase.Client;
import clase.PersoanaJuridica;

public class FabricaPersoanaJuridica implements FabricaClient{
    @Override
    public Client creeazaClient(String nume, String adresa) {
        return new PersoanaJuridica(nume, adresa);
    }
}
