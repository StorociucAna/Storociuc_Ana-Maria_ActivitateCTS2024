package clase.Factory;

import clase.Client;

public interface FabricaClient {
    public Client creeazaClient(String nume, String adresa);
}
