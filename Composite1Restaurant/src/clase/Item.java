package clase;

public class Item implements StructuraAbstracta{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println(" Item: " + nume);
    }
}
