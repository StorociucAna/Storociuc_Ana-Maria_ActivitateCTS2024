package main;

import clase.AdapterFrameworkNou;
import clase.AplicatieBancara;
import clase.LeasingCredit;

public class Main {
    public static void main(String[] args) {
        LeasingCredit leasingCredit = new LeasingCredit("Ion", 50000.0);

        AplicatieBancara adapter = new AdapterFrameworkNou(leasingCredit);

        adapter.oferaCredit(leasingCredit.getNumeClient(), leasingCredit.getSuma());
    }
}
