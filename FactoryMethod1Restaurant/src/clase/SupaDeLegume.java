package clase;

public class SupaDeLegume extends Supa{
    public SupaDeLegume(String nume, int numarIngrediente) {
        super(nume, numarIngrediente);
    }

    public void afiseazaDetalii() {
        System.out.println("Supa de "+ getNume() + " se prepara.");
    }
}
