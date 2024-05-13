package clase;

public class Pacient implements Observer{
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(String mesaj) {
        System.out.println("Pacientul " + nume + " a primit notificarea: " + mesaj);
    }
}
