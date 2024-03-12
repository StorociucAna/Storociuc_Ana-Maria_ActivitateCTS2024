package Main;

import clase.PersonalSpital;
import clase.Factory.FabricaAsistent;
import clase.Factory.FabricaBrancardier;
import clase.Factory.FabricaMedic;
import clase.Factory.FabricaPersonal;

public class Main {

    public static void prelucrarePersonal(FabricaPersonal fabrica, String nume, int salariu){
        PersonalSpital personal = fabrica.createPersonal(nume, salariu);

    }

    public static void main(String[]args){
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaAsistent = new FabricaAsistent();
        FabricaPersonal fabricaBrancardier = new FabricaBrancardier();

        PersonalSpital medic = fabricaMedic.createPersonal("Pop M", 1000);
        PersonalSpital asistent = fabricaAsistent.createPersonal("Pop C", 2000);
        PersonalSpital brancardier = fabricaBrancardier.createPersonal("Pop I", 3000);

        medic.afisareDetalii();
        asistent.afisareDetalii();
        brancardier.afisareDetalii();

        prelucrarePersonal(new FabricaMedic(), "Pop A", 1500);
    }
}

