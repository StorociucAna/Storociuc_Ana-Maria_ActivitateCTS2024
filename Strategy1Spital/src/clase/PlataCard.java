package clase;

public class PlataCard implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Plata de " + suma + " lei a fost efectuata cu cardul");
    }
}
