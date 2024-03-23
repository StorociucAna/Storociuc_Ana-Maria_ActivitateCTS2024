package clase;

public class BuilderRezervare implements Builder {
    Rezervare rezervare;
    public BuilderRezervare(){
        rezervare = new Rezervare(false, false,false, false,"");
    }

    public BuilderRezervare setAșezareLaGeam(boolean așezareLaGeam) {
        this.rezervare.setAșezareLaGeam(așezareLaGeam);
        return this;
    }

    public BuilderRezervare setScauneErgonomice(boolean scauneErgonomice) {
        this.rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public BuilderRezervare setDecorareaMesei(boolean decorareaMesei) {
        this.rezervare.setDecorareaMesei(decorareaMesei);
        return this;
    }

    public BuilderRezervare setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    public BuilderRezervare setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
