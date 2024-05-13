package clase;

public class Restaurant implements ServiciuRezervare{
    @Override
    public void rezerva(Client client) {
        System.out.println("Rezervarea pentru " + client.getNumarPersoane() + " persoane a fost realizată.");
    }
}
