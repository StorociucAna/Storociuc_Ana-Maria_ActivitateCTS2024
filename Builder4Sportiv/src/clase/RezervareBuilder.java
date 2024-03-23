package clase;

public class RezervareBuilder implements Builder {

    Rezervare rezervare;
    public RezervareBuilder(){
        rezervare =new Rezervare(false, false, false, false,"");
    }
    public RezervareBuilder setMâncareInclusa(boolean mâncareInclusa) {
        this.rezervare.setMâncareInclusa(mâncareInclusa);
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public RezervareBuilder setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        this.rezervare.setBauturaRacoritoareInclusa(bauturaRacoritoareInclusa);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.rezervare.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
