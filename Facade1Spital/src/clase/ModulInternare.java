package clase;

public class ModulInternare {
    private Medic medic;
    private Salon salon;

    public ModulInternare(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }
    public boolean efectueazaInternare(Pacient pacient) {
        System.out.println("Verificare gravitate stare pacient: " + pacient.getStarea());

        boolean confirmareMedic = medic.confirmareInternare(pacient);
        if (!confirmareMedic) {
            System.out.println("Medicul nu a confirmat internarea pacientului " + pacient.getNume());
            return false;
        }

        boolean disponibilitatePat = salon.verificaDisponibilitatePat();
        if (!disponibilitatePat) {
            System.out.println("Nu există paturi disponibile pentru internarea pacientului " + pacient.getNume());
            return false;
        }

        return true;
    }
}
