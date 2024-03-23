package clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(String denumire, int numarPasageri) {
        super(denumire, numarPasageri);
    }

    @Override
    public void afiseazaDetalii() {

        System.out.println(getDenumire() + "ul " + " are o capacitate de " + getNumarPasageri() + " pasageri.");
    }
}
