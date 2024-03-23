package main;

import clase.BuilderCont;
import clase.Cont;

public class Main {
    public static void main(String[] args) {
        Cont cont = new BuilderCont()
                .setCardAtasat(true)
                .setPrimesteSalariul(false)
                .setInternetBanking(true)
                .build();

        System.out.println(cont);
    }
}
