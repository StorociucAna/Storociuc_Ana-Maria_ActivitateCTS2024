package clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaPacient {
    private Map<String, PacientFlyweight> pacienti = new HashMap<>();

    public PacientFlyweight getPacient(String nume, String numarTelefon, String adresa) {
        String cheie = nume.toLowerCase();

        if (!pacienti.containsKey(cheie)) {
            PacientFlyweight pacient = new PacientConcret(nume, numarTelefon, adresa);
            pacienti.put(cheie, pacient);
        }

        return pacienti.get(cheie);
    }
}
