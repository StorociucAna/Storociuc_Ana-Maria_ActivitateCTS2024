package clase;

public class PlatformaEBiletExistenta implements PlatformaEBilet{
    @Override
    public void vindeBilet(String numeMeci, String categorie) {
        System.out.println("Bilet vandut pentru meciul " + numeMeci + " categorie " + categorie);
    }
}
