package main;

import clase.AdapterAplicatieLaPlatforma;
import clase.Bilet;
import clase.PlatformaEBilet;
import clase.PlatformaEBiletExistenta;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new Bilet("FC Barcelona vs Real Madrid", "VIP");
        PlatformaEBilet adapter = new AdapterAplicatieLaPlatforma(bilet);
        adapter.vindeBilet(bilet.getNumeMeci(), bilet.getCategorie());
    }
}
