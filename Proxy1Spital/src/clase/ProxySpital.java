package clase;

public class ProxySpital implements ServiciuInternare {
    private Spital spital;

    public ProxySpital() {
        this.spital = new Spital();
    }

    @Override
    public void internare(Pacient pacient) {
        if(pacient.isAreAsigurareDeSanatate()){
            spital.internare(pacient);
        }else{
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat");
        }
    }
}
