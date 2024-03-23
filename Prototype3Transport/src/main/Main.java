package main;

import clase.MijlocTransport;
import clase.MijlocTransportAbstract;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuzStandard = new MijlocTransport("Autobuz", 40);
        System.out.println(autobuzStandard);
        MijlocTransportAbstract autobuz = autobuzStandard.clone();
        System.out.println(autobuz);
    }
}
