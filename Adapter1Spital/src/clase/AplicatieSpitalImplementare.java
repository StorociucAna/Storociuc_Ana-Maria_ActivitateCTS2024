package clase;

public class AplicatieSpitalImplementare implements AplicatieSpital {
    @Override
    public void achizitioneazaMedicament(Medicament medicament) {
        System.out.println("Medicament achiziționat: " + medicament.getNume());
        prezintaReteta();
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Verificare rețetă...");
    }
}
