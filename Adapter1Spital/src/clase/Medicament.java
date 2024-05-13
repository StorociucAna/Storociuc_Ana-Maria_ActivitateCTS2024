package clase;

public class Medicament {
    private String nume;
    private boolean necesitaReteta;

    public Medicament(String nume, boolean necesitaReteta) {
        this.nume = nume;
        this.necesitaReteta = necesitaReteta;
    }

    public String getNume() {
        return nume;
    }

    public boolean necesitaReteta() {
        return necesitaReteta;
    }
}
