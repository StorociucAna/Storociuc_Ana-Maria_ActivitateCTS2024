package clase.Factory;

import clase.Credit;
import clase.CreditNevoiPersonale;

public class FabricaCreditNevoiPersonale implements FabricaCredit{
    @Override
    public Credit creeazaCredit(String tipCredit, int perioada) {
        return new CreditNevoiPersonale(tipCredit,perioada);
    }
}
