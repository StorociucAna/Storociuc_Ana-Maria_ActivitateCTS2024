package main;

import clase.CardSanatate;
import clase.DepozitMedicamente;
import clase.ModulFarmacie;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta();
        CardSanatate cardSanatate = new CardSanatate(true);
        DepozitMedicamente depozitMedicamente = new DepozitMedicamente();

        ModulFarmacie modulFarmacie = new ModulFarmacie(reteta, cardSanatate, depozitMedicamente);
        boolean verificareReusita = modulFarmacie.efectueazaVerificari("Paracetamol");
        if(verificareReusita){
            System.out.println("Toate verificările pentru cumpărarea medicamentului sunt în regulă.");
        } else{
            System.out.println("Verificările pentru cumpărarea medicamentului nu sunt în regulă.");
        }
    }
}
