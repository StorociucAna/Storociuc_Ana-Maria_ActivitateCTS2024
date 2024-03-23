package clase;

public class Atacant extends Jucator{
    public Atacant(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Jucatorul " + getNume() + " este Atacant");
    }
}
