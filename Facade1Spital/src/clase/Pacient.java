package clase;

public class Pacient {
    private String nume;
    private String starea;

    public Pacient(String nume, String starea) {
        this.nume = nume;
        this.starea = starea;
    }

    public String getNume() {
        return nume;
    }

    public String getStarea() {
        return starea;
    }
}
