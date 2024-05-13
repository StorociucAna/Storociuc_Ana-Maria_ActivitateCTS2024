package main;

import clase.Masa;
import clase.ModulReceptie;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(true, true, true);
        ModulReceptie modulReceptie = new ModulReceptie(masa);
        boolean verificareReusita = modulReceptie.verificaMasa();
        if(verificareReusita){
            System.out.println("Toate verificările pentru masa sunt în regulă.");
        }
        else{
            System.out.println("Verificările pentru masa nu sunt în regulă. Rezervați altă masă.");
        }
    }
}
