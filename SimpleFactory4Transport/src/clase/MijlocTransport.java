package clase;

public abstract class MijlocTransport {
    private String denumire;
    private int numarPasageri;

    public MijlocTransport(String denumire, int numarPasageri) {
        this.denumire = denumire;
        this.numarPasageri = numarPasageri;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNumarPasageri() {
        return numarPasageri;
    }
    public abstract void afiseazaDetalii();
}
