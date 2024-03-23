package clase.Factory;

import clase.Credit;

public interface FabricaCredit {
    public Credit creeazaCredit(String tipCredit, int perioada);
}
