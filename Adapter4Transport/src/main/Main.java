package main;

import clase.AdapterValidareTransportSubteran;
import clase.ValidareBiletTransportTerestru;

public class Main {
    public static void main(String[] args) {
        ValidareBiletTransportTerestru validareBiletTransportTerestru = new ValidareBiletTransportTerestru();
        validareBiletTransportTerestru.validareBilet();
        AdapterValidareTransportSubteran validareTransportSubteran = new AdapterValidareTransportSubteran();
        validareTransportSubteran.validareBilet();
    }
}
