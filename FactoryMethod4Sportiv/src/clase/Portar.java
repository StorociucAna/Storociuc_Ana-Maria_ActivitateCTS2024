package clase;

public class Portar extends Jucator{
    public Portar(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Jucatorul " + getNume() + " este Portar");
    }
}
