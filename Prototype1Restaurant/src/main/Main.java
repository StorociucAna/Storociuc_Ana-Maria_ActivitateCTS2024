package main;

import clase.Client;
import clase.ClientAbstract;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> rezervari = new HashMap<>();
        rezervari.put("Masa1", 4);
        rezervari.put("Masa5", 2);

        Client prototip = new Client(rezervari,"Marinescu Alexandra");
        ClientAbstract client2 = prototip.clone();
        Client client3 =(Client) prototip.clone();
        client3.setNumeClient("Popescu Ion");
        System.out.println(client2);
        System.out.println(client3);
    }
}
