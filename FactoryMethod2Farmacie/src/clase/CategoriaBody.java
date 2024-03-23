package clase;

public class CategoriaBody extends Medicament{
    public CategoriaBody(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Medicamentul " + getDenumire() + " la pretul de " + getPret() + " lei face parte din categoria Body.");
    }
}
