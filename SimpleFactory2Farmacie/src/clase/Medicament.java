package clase;

public abstract class Medicament {
    private String denumire;
    private float pret;

    public Medicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }
    public void afiseazaDetalii(){
        System.out.println("Medicamentul: " + getDenumire() + " costa " + getPret() + " lei.");
    }
}
