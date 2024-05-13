package clase;

public class AdapterValidareTransportSubteran implements ValidareBilet{
    ValidareBiletTransportTerestru validareBiletTransportTerestru;

    public AdapterValidareTransportSubteran() {
        validareBiletTransportTerestru = new ValidareBiletTransportTerestru();
    }

    @Override
    public void validareBilet() {
        System.out.println("Bilet valid si pentru subteran");
    }
}
