package clase;

public class MijlocTransport implements MijlocTransportAbstract{

    private String denumire;
    private int numarPasageri;
    public MijlocTransport(String denumire, int numarPasageri) {
        this.denumire = denumire;
        this.numarPasageri = numarPasageri;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "denumire='" + denumire + '\'' +
                ", numarPasageri=" + numarPasageri +
                '}';
    }

    @Override
    public MijlocTransportAbstract clone() {
        return new MijlocTransport(denumire, numarPasageri);
    }
}
