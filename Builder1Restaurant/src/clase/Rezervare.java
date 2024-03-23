package clase;

public class Rezervare {
    private boolean așezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    public Rezervare(boolean așezareLaGeam, boolean scauneErgonomice, boolean decorareaMesei, boolean muzicaAmbientalaPersonalizata, String genMuzica) {
        this.așezareLaGeam = așezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public void setAșezareLaGeam(boolean așezareLaGeam) {
        this.așezareLaGeam = așezareLaGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "așezareLaGeam=" + așezareLaGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareaMesei=" + decorareaMesei +
                ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
