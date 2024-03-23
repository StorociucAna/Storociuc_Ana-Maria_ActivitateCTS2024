package main;

import clase.Client;
import clase.ClientAbstract;

public class Main {
    public static void main(String[] args) {
        Client clientContStandard = new Client("Popa Maria", "CNP:02980203152413, Adresa: Bucuresti", "Numar card:02150244, cod Securitate: 421");
        System.out.println(clientContStandard);
        ClientAbstract clientContNou = clientContStandard.clone();
        System.out.println(clientContNou);
    }
}
