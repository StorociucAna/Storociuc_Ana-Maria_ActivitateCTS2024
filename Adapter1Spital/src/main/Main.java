package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        AplicatieSpital aplicatieSpital = new AplicatieSpitalImplementare();

        AplicatieFarmacie aplicatieFarmacie = new AdapterAplicatieFarmacie(aplicatieSpital);

        Medicament medicament = new Medicament("Paracetamol", true);
        aplicatieFarmacie.cumparaMedicament(medicament);

        Medicament medicamentFaraReteta = new Medicament("Vitamina C", false);
        aplicatieFarmacie.cumparaMedicament(medicamentFaraReteta);
    }
}
