package clase;

public class PacientConcret implements PacientFlyweight {
    private String nume;
    private String numarTelefon;
    private String adresa;

    public PacientConcret(String nume, String numarTelefon, String adresa) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println("Nume pacient: " + nume);
        System.out.println("Număr de telefon: " + numarTelefon);
        System.out.println("Adresă: " + adresa);
    }
}
