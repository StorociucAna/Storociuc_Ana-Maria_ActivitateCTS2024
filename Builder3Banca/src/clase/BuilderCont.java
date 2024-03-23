package clase;

public class BuilderCont implements Builder{

    Cont cont;
    public BuilderCont(){
        cont = new Cont(false, false, false);
    }
    public BuilderCont setPrimesteSalariul(boolean primesteSalariul) {
        this.cont.setPrimesteSalariul(primesteSalariul);
        return this;
    }

    public BuilderCont setCardAtasat(boolean cardAtasat) {
        this.cont.setCardAtasat(cardAtasat);
        return this;
    }

    public BuilderCont setInternetBanking(boolean internetBanking) {
        this.cont.setInternetBanking(internetBanking);
        return this;
    }

    @Override
    public Cont build() {
        return cont;
    }
}
