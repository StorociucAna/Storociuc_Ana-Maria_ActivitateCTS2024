package SimpleFactory.main;

import SimpleFactory.clase.Fabrica.FabricaPersonal;
import SimpleFactory.clase.Fabrica.TipPersonal;
import SimpleFactory.clase.PersonalSpital;

public class Main {
    public static void main(String[] args){
        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        try{
            PersonalSpital medic=fabricaPersonal.createPersonal(TipPersonal.MEDIC, "Popescu M", 5500);
            PersonalSpital asistent=fabricaPersonal.createPersonal(TipPersonal.ASISTENT,"Marian C", 3200);
            PersonalSpital brancardier=fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER, "Vasile I", 4500);
            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

