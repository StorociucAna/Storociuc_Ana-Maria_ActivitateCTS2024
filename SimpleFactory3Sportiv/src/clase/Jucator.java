package clase;

public abstract class Jucator {

    private String nume;

    public Jucator(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    public abstract void afisezaDetalii();
}
