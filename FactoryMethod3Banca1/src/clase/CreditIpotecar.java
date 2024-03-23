package clase;

public class CreditIpotecar extends Credit{
    public CreditIpotecar(String tipCredit, int perioada) {
        super(tipCredit, perioada);
    }
    @Override
    public void afiseazaDetalii() {
        System.out.println("Creditul de tip: " + getTipCredit() + " a fost facut pe o perioada de " + getPerioada() + " ani.");
    }
}
