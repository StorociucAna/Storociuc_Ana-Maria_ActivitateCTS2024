package clase;

public class Cont {
    private boolean primesteSalariul;
    private boolean cardAtasat;
    private boolean internetBanking;

    public Cont(boolean primesteSalariul, boolean cardAtasat, boolean internetBanking) {
        this.primesteSalariul = primesteSalariul;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    public void setPrimesteSalariul(boolean primesteSalariul) {
        this.primesteSalariul = primesteSalariul;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "primesteSalariul=" + primesteSalariul +
                ", cardAtasat=" + cardAtasat +
                ", internetBanking=" + internetBanking +
                '}';
    }
}
