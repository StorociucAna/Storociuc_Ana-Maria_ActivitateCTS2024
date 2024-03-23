package clase;

public class JucatorFundas extends Jucator {
    public JucatorFundas(String nume) {
        super(nume);
    }

    @Override
    public void afisezaDetalii() {
        System.out.println("Jucatorul " + getNume() + " este Fundas.");
    }
}
