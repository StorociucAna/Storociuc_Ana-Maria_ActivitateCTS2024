package clase;

public class AutobuzLinie {
    private String modelAutobuz;
    private String sofer;
    private boolean opririCapatLinie;
    private boolean usiDeschiseFaraSolicitare;
    private String textEcranDerulator;

    public AutobuzLinie(String modelAutobuz, String sofer, boolean opririCapatLinie, boolean usiDeschiseFaraSolicitare, String textEcranDerulator) {
        this.modelAutobuz = modelAutobuz;
        this.sofer = sofer;
        this.opririCapatLinie = opririCapatLinie;
        this.usiDeschiseFaraSolicitare = usiDeschiseFaraSolicitare;
        this.textEcranDerulator = textEcranDerulator;
    }

    public void setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public void setOpririCapatLinie(boolean opririCapatLinie) {
        this.opririCapatLinie = opririCapatLinie;
    }

    public void setUsiDeschiseFaraSolicitare(boolean usiDeschiseFaraSolicitare) {
        this.usiDeschiseFaraSolicitare = usiDeschiseFaraSolicitare;
    }

    public void setTextEcranDerulator(String textEcranDerulator) {
        this.textEcranDerulator = textEcranDerulator;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "modelAutobuz='" + modelAutobuz + '\'' +
                ", sofer='" + sofer + '\'' +
                ", opririCapatLinie=" + opririCapatLinie +
                ", usiDeschiseFaraSolicitare=" + usiDeschiseFaraSolicitare +
                ", textEcranDerulator='" + textEcranDerulator + '\'' +
                '}';
    }
}
