package clase.Factory;

import clase.Asistent;
import clase.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume,salariu);
    }
}

