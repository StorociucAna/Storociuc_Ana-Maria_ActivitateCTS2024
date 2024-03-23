package clase;

public abstract class Credit {
    private String tipCredit;
    private int perioada;


    public Credit(String tipCredit, int perioada) {
        this.tipCredit = tipCredit;
        this.perioada = perioada;
    }

    public String getTipCredit() {
        return tipCredit;
    }

    public int getPerioada() {
        return perioada;
    }
    public abstract void afiseazaDetalii();
}
