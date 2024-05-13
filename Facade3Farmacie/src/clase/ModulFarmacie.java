package clase;

public class ModulFarmacie {
    private Reteta reteta;
    private CardSanatate cardSanatate;
    private DepozitMedicamente depozitMedicamente;

    public ModulFarmacie(Reteta reteta, CardSanatate cardSanatate, DepozitMedicamente depozitMedicamente) {
        this.reteta = reteta;
        this.cardSanatate = cardSanatate;
        this.depozitMedicamente = depozitMedicamente;
    }
    public boolean efectueazaVerificari(String medicament){
        if(!reteta.esteValabila()){
            System.out.println("Reteta nu este valabila");
            return false;
        }
        if(!depozitMedicamente.verificaDisponibilitateMedicament(medicament)){
            System.out.println("Medicamentul " + medicament + " nu este disponibil in depozit");
            return false;
        }
        if(!cardSanatate.esteValid()){
            System.out.println("Cardul nu este valid");
            return false;
        }
        return true;
    }
}
