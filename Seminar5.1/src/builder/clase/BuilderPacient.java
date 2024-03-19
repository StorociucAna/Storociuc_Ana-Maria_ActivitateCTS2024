package builder.clase;

public class BuilderPacient implements Builder {

    Pacient pacient;

    public BuilderPacient() {
        pacient = new Pacient(false, false, false, false);
    }

    public BuilderPacient setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public BuilderPacient setMicDeJunInclus(boolean micDeJunInclus) {
        this.pacient.setMicDeJunInclus(micDeJunInclus);
        return this;
    }

    public BuilderPacient setPapuciDeCamera(boolean papuciDeCamera) {
        this.pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public BuilderPacient setHalatPentruInterior(boolean halatPentruInterior) {
        this.pacient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }

    public Pacient build() {
        return pacient;
    }


}
