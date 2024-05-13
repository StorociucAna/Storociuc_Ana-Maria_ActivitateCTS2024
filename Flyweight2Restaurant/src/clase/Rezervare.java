package clase;

public class Rezervare {
    private ClientFlyweight client;
    private int numărMasa;
    private int numărPersoane;
    private int oraRezervare;

    public Rezervare(ClientFlyweight client, int numărMasa, int numărPersoane, int oraRezervare) {
        this.client = client;
        this.numărMasa = numărMasa;
        this.numărPersoane = numărPersoane;
        this.oraRezervare = oraRezervare;
    }
    public void afiseazaInformatii(){
        client.afiseazaInformatii();
        System.out.println("Numar masa: " + numărMasa);
        System.out.println("Numar Persoane: " + numărPersoane);
        System.out.println("Ora rezervare: " + oraRezervare);
    }
}
