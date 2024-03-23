package clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(String denumire, int numarPasageri) {
        super(denumire, numarPasageri);
    }

    private static Autobuz instanta;
    public static Autobuz getInstance(String denumire, int numarPasageri){
        if(instanta == null){
            instanta = new Autobuz(denumire,numarPasageri);
        }
        return instanta;
    }
    @Override
    public void afiseazaDetalii() {
        System.out.println(getDenumire() + "ul " + " are o capacitate de " + getNumarPasageri() + " pasageri.");
    }
}
