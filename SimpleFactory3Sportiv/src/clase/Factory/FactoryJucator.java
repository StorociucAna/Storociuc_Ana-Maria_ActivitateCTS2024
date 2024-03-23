package clase.Factory;

import clase.Jucator;
import clase.JucatorAtacant;
import clase.JucatorFundas;
import clase.JucatorPortar;

public class FactoryJucator {
    public Jucator afiseazaTipJucator(TipJucator tipJucator, String nume) throws Exception{
        switch (tipJucator){
            case ATACANT:
                Jucator atacant = new JucatorAtacant(nume);
                return atacant;
            case FUNDAS:
                Jucator fundas = new JucatorFundas(nume);
                return fundas;
            case PORTAR:
                Jucator portar = new JucatorPortar(nume);
                return portar;
            default:
                throw new IllegalArgumentException("necunoscut" + tipJucator);
        }
    }
}
