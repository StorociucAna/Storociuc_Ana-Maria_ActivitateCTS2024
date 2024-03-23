package clase;

public class Fundas extends Jucator{
    public Fundas(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Jucatorul " + getNume() + " este Fundas");
    }
}
