package clase;

public class LeasingCredit {
    private String numeClient;
    private double suma;

    public LeasingCredit(String numeClient, double suma) {
        this.numeClient = numeClient;
        this.suma = suma;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public double getSuma() {
        return suma;
    }
}
