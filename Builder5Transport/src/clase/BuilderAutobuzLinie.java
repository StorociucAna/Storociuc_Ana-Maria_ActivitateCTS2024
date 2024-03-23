package clase;

public class BuilderAutobuzLinie implements Builder{

    public AutobuzLinie autobuzLinie;
    public BuilderAutobuzLinie() {
        autobuzLinie = new AutobuzLinie("", "", false, false, "");
    }
    public BuilderAutobuzLinie setModelAutobuz(String modelAutobuz) {
        this.autobuzLinie.setModelAutobuz(modelAutobuz);
        return this;
    }

    public BuilderAutobuzLinie setSofer(String sofer) {
        this.autobuzLinie.setSofer(sofer);
        return this;
    }

    public BuilderAutobuzLinie setOpririCapatLinie(boolean opririCapatLinie) {
        this.autobuzLinie.setOpririCapatLinie(opririCapatLinie);
        return this;
    }

    public BuilderAutobuzLinie setUsiDeschiseFaraSolicitare(boolean usiDeschiseFaraSolicitare) {
        this.autobuzLinie.setUsiDeschiseFaraSolicitare(usiDeschiseFaraSolicitare);
        return this;
    }

    public BuilderAutobuzLinie setTextEcranDerulator(String textEcranDerulator) {
        this.autobuzLinie.setTextEcranDerulator(textEcranDerulator);
        return this;
    }

    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }
}
