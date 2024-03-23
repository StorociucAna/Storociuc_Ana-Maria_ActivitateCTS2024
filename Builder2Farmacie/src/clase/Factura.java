package clase;

public class Factura {
    private int numarPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private double cotaTVA;

    public Factura(int numarPungi, boolean plataCuCard, boolean cardFidelitate, double cotaTVA) {
        this.numarPungi = numarPungi;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    public void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setCotaTVA(double cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numarPungi=" + numarPungi +
                ", plataCuCard=" + plataCuCard +
                ", cardFidelitate=" + cardFidelitate +
                ", cotaTVA=" + cotaTVA +
                '}';
    }
}
