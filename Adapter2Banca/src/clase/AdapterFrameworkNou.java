package clase;

public class AdapterFrameworkNou implements AplicatieBancara{
    private LeasingCredit leasingCredit;

    public AdapterFrameworkNou(LeasingCredit leasingCredit) {
        this.leasingCredit = leasingCredit;
    }
    @Override
    public void oferaCredit(String numeClient, double suma) {
        System.out.println("Adaptare și oferire credit pentru " + leasingCredit.getNumeClient() + " în valoare de " + leasingCredit.getSuma() + " lei");
    }
}
