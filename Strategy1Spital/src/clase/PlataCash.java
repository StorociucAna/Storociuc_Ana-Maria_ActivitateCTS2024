package clase;

public class PlataCash implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Plata de " + suma + " lei a fost efectuata in numerar");
    }
}
