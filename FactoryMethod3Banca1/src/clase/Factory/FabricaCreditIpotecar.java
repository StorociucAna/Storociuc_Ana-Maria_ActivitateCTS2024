package clase.Factory;

import clase.Credit;
import clase.CreditIpotecar;

public class FabricaCreditIpotecar implements FabricaCredit{
    @Override
    public Credit creeazaCredit(String tipCredit, int perioada) {
        return new CreditIpotecar(tipCredit, perioada);
    }
}
