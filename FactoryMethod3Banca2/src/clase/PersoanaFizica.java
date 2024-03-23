package clase;

public class PersoanaFizica extends Client{
    public PersoanaFizica(String nume, String adresa) {
        super(nume, adresa);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Clientul " + getNume() + " primeste servicii pe persoana fizica.");
    }
}
