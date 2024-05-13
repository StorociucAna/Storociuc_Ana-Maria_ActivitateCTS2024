package clase;

public class Masa {
    private boolean esteLibera;
    private boolean esteDebarasata;
    private boolean auFostPuseServetele;

    public Masa(boolean esteLibera, boolean esteDebarasata, boolean auFostPuseServetele) {
        this.esteLibera = esteLibera;
        this.esteDebarasata = esteDebarasata;
        this.auFostPuseServetele = auFostPuseServetele;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }

    public boolean isAuFostPuseServetele() {
        return auFostPuseServetele;
    }
}
