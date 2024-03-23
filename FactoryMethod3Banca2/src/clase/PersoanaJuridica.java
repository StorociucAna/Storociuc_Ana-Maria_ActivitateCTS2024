package clase;

public class PersoanaJuridica extends Client{
    public PersoanaJuridica(String nume, String adresa) {
        super(nume, adresa);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Clientul " + getNume() + " primeste servicii pe persoana juridica.");
    }
}
