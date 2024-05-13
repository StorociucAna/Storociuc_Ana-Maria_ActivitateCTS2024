package clase;

public class ProxyRestaurant implements ServiciuRezervare{
    private Restaurant restaurant;

    public ProxyRestaurant() {
        this.restaurant = new Restaurant();
    }

    @Override
    public void rezerva(Client client) {
        if(client.getNumarPersoane()>=4){
            restaurant.rezerva(client);
        }else{
            System.out.println("Rezervarea pentru " + client.getNumarPersoane() + " persoane nu poate fi realizată.");
            System.out.println("Vă rugăm să veniți la restaurant, avem locuri suficiente pentru mesele de două persoane.");
        }
    }
}
