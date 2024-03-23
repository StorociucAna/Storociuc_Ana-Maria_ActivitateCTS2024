package clase;

public abstract class Supa {
    private String nume;
    private int numarIngrediente;

    public Supa(String nume, int numarIngrediente) {
        this.nume = nume;
        this.numarIngrediente = numarIngrediente;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "nume='" + nume + '\'' +
                ", numarIngrediente=" + numarIngrediente +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public abstract void afiseazaDetalii();
}
