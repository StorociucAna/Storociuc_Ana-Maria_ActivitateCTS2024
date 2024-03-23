package clase;

public class Rezervare {
    private boolean mâncareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoareInclusa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public Rezervare(boolean mâncareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoareInclusa, boolean muzicaAmbientala, String genMuzica) {
        this.mâncareInclusa = mâncareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public void setMâncareInclusa(boolean mâncareInclusa) {
        this.mâncareInclusa = mâncareInclusa;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "mâncareInclusa=" + mâncareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacoritoareInclusa=" + bauturaRacoritoareInclusa +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
