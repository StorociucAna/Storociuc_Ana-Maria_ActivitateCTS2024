package main;

import clase.Credit;
import clase.CreditIpotecar;
import clase.Factory.FabricaCredit;
import clase.Factory.FabricaCreditIpotecar;
import clase.Factory.FabricaCreditNevoiPersonale;

public class Main {
    public static void prelucreazaCredit(FabricaCredit fabricaCredit, String tipCredit, int perioada){
        Credit credit = fabricaCredit.creeazaCredit(tipCredit, perioada);
        credit.afiseazaDetalii();
    }

    public static void main(String[] args) {
        FabricaCredit fabricaCreditNevoiPersonale = new FabricaCreditNevoiPersonale();
        FabricaCredit fabricaCreditIpotecar = new FabricaCreditIpotecar();

        Credit creditIpotecar = fabricaCreditIpotecar.creeazaCredit("ipotecar", 5);
        Credit creditNevoiPersonale = fabricaCreditNevoiPersonale.creeazaCredit("nevoi personale", 10);

        creditIpotecar.afiseazaDetalii();
        creditNevoiPersonale.afiseazaDetalii();

        prelucreazaCredit(new FabricaCreditIpotecar(), "ipotecar", 10);
    }
}
