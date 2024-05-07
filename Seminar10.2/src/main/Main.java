package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Portar portar=new Portar();
        String suporter1,suporter2,suporter3;
        suporter1="GigelVIP";
        suporter2="GigelTribuna";
        suporter3="GigelPeluza";
        portar.setStrategie(new VerificatorVIP());
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter3);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter2);
    }
}
