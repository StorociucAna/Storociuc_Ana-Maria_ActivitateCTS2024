package main;

import clase.NotaDePlata;
import clase.NotaDePlataAbstracta;
import decorator.Decorator;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata();
        notaDePlata.printeaza();
        NotaDePlataAbstracta notaDePlataCuFelicitare = new Decorator(notaDePlata);
        notaDePlataCuFelicitare.printeaza();
    }
}
