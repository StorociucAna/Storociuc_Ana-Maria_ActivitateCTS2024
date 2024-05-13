package main;

import clase.Client;
import clase.ProxyRestaurant;

public class Main {
    public static void main(String[] args) {
        ProxyRestaurant proxyRestaurant = new ProxyRestaurant();

        Client client1 = new Client(5);
        Client client2 = new Client(2);

        proxyRestaurant.rezerva(client1);
        proxyRestaurant.rezerva(client2);
    }
}
