package clase;

public class SupaDeCiuperci extends Supa{
    public SupaDeCiuperci(String nume, int numarIngrediente) {
        super(nume, numarIngrediente);
    }

    public void afiseazaDetalii() {
        System.out.println("Supa de "+ getNume() + " se prepara.");
    }
}
