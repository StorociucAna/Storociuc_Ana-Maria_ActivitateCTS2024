package clase;

public class ProcesInternare extends InternarePacient{
    @Override
    protected void analizeazaStarePacient() {
        System.out.println("Se analizează starea pacientului pentru internare...");
    }

    @Override
    protected void verificaDisponibilitateSaloane() {
        System.out.println("Se verifică disponibilitatea în saloanele spitalului...");
    }

    @Override
    protected void emiteFisaInternare() {
        System.out.println("Se emite fișa de internare pentru pacient...");
    }
}
