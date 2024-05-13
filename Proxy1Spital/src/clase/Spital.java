package clase;

public class Spital implements ServiciuInternare{
    @Override
    public void internare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume()+ " a fost internat in spital");
    }
}
