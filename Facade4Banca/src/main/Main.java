package main;

import clase.Client;
import clase.ModulCreareCont;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(true, false, false);
        ModulCreareCont modulCreareCont = new ModulCreareCont(client);
        boolean poateSaCreezeCont = modulCreareCont.poateCreaCont();
        if(poateSaCreezeCont){
            System.out.println("Se poate crea contul");
        }else{
            System.out.println("Nu se poate crea contul");
        }
    }
}
