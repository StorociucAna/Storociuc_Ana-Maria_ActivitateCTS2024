package main;

import clase.Factory.FabricaMijlocTransport;
import clase.Factory.TipMijlocTransport;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        FabricaMijlocTransport fabricaMijlocTransport = new FabricaMijlocTransport();
        try {
            MijlocTransport autobuz = fabricaMijlocTransport.creeaza(TipMijlocTransport.AUTOBUZ, "Autobuz", 50);
            MijlocTransport tramvai = fabricaMijlocTransport.creeaza(TipMijlocTransport.TRAMVAI, "Tramvai", 30);
            MijlocTransport troleibuz = fabricaMijlocTransport.creeaza(TipMijlocTransport.TROLEIBUZ, "Troleibuz", 40);
            autobuz.afiseazaDetalii();
            tramvai.afiseazaDetalii();
            troleibuz.afiseazaDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
