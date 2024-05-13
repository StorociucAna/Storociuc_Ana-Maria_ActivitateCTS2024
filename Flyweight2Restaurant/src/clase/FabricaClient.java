package clase;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FabricaClient {
    private Map<String, ClientFlyweight> clienti = new HashMap<>();

    public ClientFlyweight getClient(String nume, String numarTelefon, String adresaMail){
        String cheie = nume.toLowerCase();

        if(!clienti.containsKey(cheie)){
            ClientFlyweight client = new ClientConcret(nume, numarTelefon, adresaMail);
            clienti.put(cheie, client);
        }
        return clienti.get(cheie);
    }
}
