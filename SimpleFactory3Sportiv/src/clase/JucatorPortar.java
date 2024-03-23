package clase;

public class JucatorPortar extends Jucator {
    public JucatorPortar(String nume) {
        super(nume);
    }

    @Override
    public void afisezaDetalii() {
        System.out.println("Jucatorul " + getNume() + " este Portar.");
    }
}
