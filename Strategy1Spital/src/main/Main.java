package main;

import clase.Plata;
import clase.PlataCard;
import clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Plata plataCard = new Plata(new PlataCard());
        plataCard.efectueazaPlata(100);

        Plata plataCash = new Plata(new PlataCash());
        plataCash.efectueazaPlata(50);
    }
}
