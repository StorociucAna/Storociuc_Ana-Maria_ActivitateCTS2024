package clase;

public class AdapterAplicatieFarmacie implements AplicatieFarmacie {

    private AplicatieSpital aplicatieSpital;

    public AdapterAplicatieFarmacie(AplicatieSpital aplicatieSpital) {
        this.aplicatieSpital = aplicatieSpital;
    }
    @Override
    public void cumparaMedicament(Medicament medicament) {
        if (medicament.necesitaReteta()) {
            aplicatieSpital.achizitioneazaMedicament(medicament);
        } else {
            System.out.println("Medicament cumpărat fără rețetă: " + medicament.getNume());
        }
    }
}
