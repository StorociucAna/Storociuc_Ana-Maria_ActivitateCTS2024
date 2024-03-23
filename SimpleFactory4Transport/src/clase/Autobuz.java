package clase;

public class Autobuz extends MijlocTransport {
    public Autobuz(String denumire, int numarPasageri) {
        super(denumire, numarPasageri);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(getDenumire() + "ul " + " are o capacitate de " + getNumarPasageri() + " pasageri.");
    }
}
