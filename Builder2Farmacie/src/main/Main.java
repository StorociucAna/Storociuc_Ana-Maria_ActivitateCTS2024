package main;

import clase.BuilderFactura;
import clase.Factura;

public class Main {
    public static void main(String[] args) {

        Factura factura = new BuilderFactura()
                .setCardFidelitate(true)
                .setNumarPungi(2)
                .setPlataCuCard(true)
                .setCotaTVA(19)
                .build();

        System.out.println(factura);
    }
}
