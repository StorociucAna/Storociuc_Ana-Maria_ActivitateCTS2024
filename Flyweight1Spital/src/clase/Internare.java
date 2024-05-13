package clase;

public class Internare {
    private PacientFlyweight pacient;
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Internare(PacientFlyweight pacient, int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.pacient = pacient;
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public void afiseazaInformatii() {
        pacient.afiseazaInformatii();
        System.out.println("Număr salon: " + numarSalon);
        System.out.println("Număr pat: " + numarPat);
        System.out.println("Număr zile spitalizare: " + numarZileSpitalizare);
    }
}
