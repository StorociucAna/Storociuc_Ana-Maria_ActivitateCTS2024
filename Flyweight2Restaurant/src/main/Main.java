package main;

import clase.ClientFlyweight;
import clase.FabricaClient;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        FabricaClient fabricaClient = new FabricaClient();

        ClientFlyweight client1 = fabricaClient.getClient("Ion", "023154862","ion@gmail.com");
        ClientFlyweight client2 = fabricaClient.getClient("Marian", "2258565248", "Marian@gmail.com");

        Rezervare rezervare1 = new Rezervare(client1,5,4,15);
        Rezervare rezervare2 = new Rezervare(client2, 3, 8, 20);

        rezervare1.afiseazaInformatii();
        System.out.println("------------------");
        rezervare2.afiseazaInformatii();
    }
}
