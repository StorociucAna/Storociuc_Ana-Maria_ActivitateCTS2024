package clase;

public abstract class Client {
    private String nume;
    private String adresa;

    public Client(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }
    public abstract void afiseazaDetalii();
}
