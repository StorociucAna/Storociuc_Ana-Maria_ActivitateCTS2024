package clase;

public class AdapterAplicatieLaPlatforma implements PlatformaEBilet{
    private Bilet bilet;

    public AdapterAplicatieLaPlatforma(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vindeBilet(String numeMeci, String categorie) {
        System.out.println("Adaptare și vânzare bilet pentru meciul " + bilet.getNumeMeci() + ", categorie: " + bilet.getCategorie());
    }
}
