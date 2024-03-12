package clase.Factory;

import clase.Medic;
import clase.PersonalSpital;

public class FabricaMedic implements FabricaPersonal{
    public PersonalSpital createPersonal(String nume, int salariu){
        return new Medic(nume,salariu);
    }
}

