package clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String denumire, int numarPasageri) {
        super(denumire, numarPasageri);
    }

    @Override
    public void afiseazaDetalii() {

        System.out.println(getDenumire()+ "ul "  + " are o capacitate de " + getNumarPasageri() + " pasageri.");
    }
}
