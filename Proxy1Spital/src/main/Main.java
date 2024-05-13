package main;

import clase.Pacient;
import clase.ProxySpital;

public class Main {
    public static void main(String[] args) {
        ProxySpital proxySpital = new ProxySpital();
        Pacient pacient1 = new Pacient("Ion", true);
        Pacient pacient2 = new Pacient("Marian", false);

        proxySpital.internare(pacient1);
        proxySpital.internare(pacient2);
    }
}
