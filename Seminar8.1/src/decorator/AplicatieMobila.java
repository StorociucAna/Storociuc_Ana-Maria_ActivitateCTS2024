package decorator;

import spital.DiagnosticAbstract;

public class AplicatieMobila extends Decorator {
    public AplicatieMobila(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("In cadrul aplicatiei mobile ati primit diagnosticul " +
                super.getNumeDiagnostic() + " cu simptomele " + super.getSimptome() +
                "si " + (super.isNecesitaSpitalizare()? "" : "nu ") + " are nevoie de spitalizare");
    }
}

