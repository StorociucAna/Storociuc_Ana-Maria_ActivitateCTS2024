package clase;

public class Client {
    private boolean esteMajor;
    private boolean esteUrmaitDePolitie;
    private boolean areCreanteLaBanci;

    public Client(boolean esteMajor, boolean esteUrmaitDePolitie, boolean areCreanteLaBanci) {
        this.esteMajor = esteMajor;
        this.esteUrmaitDePolitie = esteUrmaitDePolitie;
        this.areCreanteLaBanci = areCreanteLaBanci;
    }

    public boolean isEsteMajor() {
        return esteMajor;
    }

    public boolean isEsteUrmaitDePolitie() {
        return esteUrmaitDePolitie;
    }

    public boolean isAreCreanteLaBanci() {
        return areCreanteLaBanci;
    }
}
