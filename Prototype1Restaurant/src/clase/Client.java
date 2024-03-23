package clase;

import java.util.HashMap;
import java.util.Map;

public class Client implements ClientAbstract{
    private Map<String, Integer> rezervari;
    private String numeClient;

    public Client(Map<String, Integer> rezervari, String numeClient) {
        this.rezervari = rezervari;
        this.numeClient = numeClient;
    }

    public Map<String, Integer> getRezervari() {
        return rezervari;
    }

    public void setRezervari(Map<String, Integer> rezervari) {
        this.rezervari = new HashMap<>();
        for(String rezervare: rezervari.keySet()){
            this.rezervari.put(rezervare, rezervari.get(rezervare));
        }
        this.rezervari=rezervari;
    }
    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }
    public Client() {
        this.rezervari = null;
        this.numeClient = "Nou";
    }

    @Override
    public ClientAbstract clone() {
        Client clientAbstract = new Client();
        clientAbstract.setRezervari(this.rezervari);
        clientAbstract.setNumeClient(this.numeClient);
        return clientAbstract;
    }

    @Override
    public String toString() {
        return "Client{" +
                "rezervari=" + rezervari +
                ", numeClient='" + numeClient + '\'' +
                '}';
    }
}
