package clase;

public class BuilderFactura implements Builder{

    Factura factura;
    public BuilderFactura(){
        factura = new Factura(0,false,false,0);
    }
    public BuilderFactura setNumarPungi(int numarPungi) {
        this.factura.setNumarPungi(numarPungi);
        return this;
    }

    public BuilderFactura setPlataCuCard(boolean plataCuCard) {
        this.factura.setPlataCuCard(plataCuCard);
        return this;
    }

    public BuilderFactura setCardFidelitate(boolean cardFidelitate) {
        this.factura.setCardFidelitate(cardFidelitate);
        return this;
    }

    public BuilderFactura setCotaTVA(double cotaTVA) {
        this.factura.setCotaTVA(cotaTVA);
        return this;
    }

    @Override
    public Factura build() {
        return factura;
    }
}
