package clase.Factory;

import clase.PersonalSpital;

public interface FabricaPersonal {
    public PersonalSpital createPersonal(String nume, int salariu);
}

