package clase;

public class ClientConcret implements ClientFlyweight{
    private String nume;
    private String numărTelefon;
    private String adresăMail;

    public ClientConcret(String nume, String numărTelefon, String adresăMail) {
        this.nume = nume;
        this.numărTelefon = numărTelefon;
        this.adresăMail = adresăMail;
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println("Nume client: " + nume);
        System.out.println("Numar de telefon: " + numărTelefon);
        System.out.println("Adresa de mail: " + adresăMail);
    }
}
