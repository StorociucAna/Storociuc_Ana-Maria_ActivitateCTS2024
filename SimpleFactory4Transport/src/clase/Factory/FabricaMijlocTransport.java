package clase.Factory;

import clase.Autobuz;
import clase.MijlocTransport;
import clase.Tramvai;
import clase.Troleibuz;

public class FabricaMijlocTransport {
    public MijlocTransport creeaza(TipMijlocTransport tipMijlocTransport, String denumire, int numarPasageri) throws Exception{
        switch(tipMijlocTransport){
            case AUTOBUZ:
                MijlocTransport autobuz = new Autobuz(denumire, numarPasageri);
                return autobuz;
            case TRAMVAI:
                MijlocTransport tramvai = new Tramvai(denumire,numarPasageri);
                return tramvai;
            case TROLEIBUZ:
                MijlocTransport troleibuz = new Troleibuz(denumire,numarPasageri);
                return troleibuz;
            default:
                throw new IllegalArgumentException("tip necunoscut");
        }
    }
}
