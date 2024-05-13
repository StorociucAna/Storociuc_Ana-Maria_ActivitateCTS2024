package clase;

public class Bilet {
    private String numeMeci;
    private String categorie;

    public Bilet(String numeMeci, String categorie) {
        this.numeMeci = numeMeci;
        this.categorie = categorie;
    }

    public String getNumeMeci() {
        return numeMeci;
    }

    public String getCategorie() {
        return categorie;
    }
}
