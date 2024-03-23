package clase;

public class JucatorAtacant extends Jucator{
    public JucatorAtacant(String nume) {
        super(nume);
    }

    @Override
    public void afisezaDetalii() {
        System.out.println("Jucatorul " + getNume() + " este Atacant.");
    }
}
