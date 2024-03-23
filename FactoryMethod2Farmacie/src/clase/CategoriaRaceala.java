package clase;

public class CategoriaRaceala extends Medicament{
    public CategoriaRaceala(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void afiseazaDetalii() {

        System.out.println("Medicamentul " + getDenumire() + " la pretul de " + getPret() + " lei face parte din categoria Raceala.");
    }
}
