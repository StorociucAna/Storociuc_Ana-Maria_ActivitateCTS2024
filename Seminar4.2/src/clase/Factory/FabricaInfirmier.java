package clase.Factory;

import clase.Infirmier;
import clase.PersonalSpital;

public class FabricaInfirmier implements FabricaPersonal{
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume,salariu);
    }
}

