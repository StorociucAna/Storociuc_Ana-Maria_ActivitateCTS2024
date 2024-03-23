package main;

import clase.AutobuzLinie;
import clase.BuilderAutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie autobuzLinie = new BuilderAutobuzLinie()
                .setUsiDeschiseFaraSolicitare(true)
                .setOpririCapatLinie(true)
                .setModelAutobuz("Model 1")
                .setSofer("Sofer 1")
                .setTextEcranDerulator("Mesaj1")
                .build();
        System.out.println(autobuzLinie);
    }
}
