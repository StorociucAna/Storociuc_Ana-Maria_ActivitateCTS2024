package clase;

public abstract class Supa {
    String denumire;
    int numarIngrediente;

    public Supa(String denumire, int numarIngrediente) {
        this.denumire = denumire;
        this.numarIngrediente = numarIngrediente;
    }

    public String getDenumire() {
        return denumire;
    }
    public void afiseazaDetalii() {

        System.out.println(getDenumire() + " se prepara.");
    }
}
