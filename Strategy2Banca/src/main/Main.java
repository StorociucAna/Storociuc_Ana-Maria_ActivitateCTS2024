package main;

import clase.ProcesareDocumente;
import clase.VerificareActePersoanaFizica;
import clase.VerificareActePersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        ProcesareDocumente procesareDocumente = new ProcesareDocumente();
        boolean estePersoanaJuridica = true;
        if(estePersoanaJuridica){
            procesareDocumente.setVerificareActeStrategy(new VerificareActePersoanaJuridica());
        }else{
            procesareDocumente.setVerificareActeStrategy(new VerificareActePersoanaFizica());
        }

        procesareDocumente.efectuareProces();
    }
}
