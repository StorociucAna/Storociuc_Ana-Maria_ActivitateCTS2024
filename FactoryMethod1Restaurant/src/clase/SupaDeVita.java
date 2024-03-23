package clase;

public class SupaDeVita extends Supa {
    public SupaDeVita(String nume, int numarIngrediente) {
        super(nume, numarIngrediente);
    }

    public void afiseazaDetalii() {
        System.out.println("Supa de "+ getNume() + " se prepara.");
    }
}
