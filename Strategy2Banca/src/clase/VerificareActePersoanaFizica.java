package clase;

public class VerificareActePersoanaFizica implements VerificareActeStrategy{
    @Override
    public void verificareActe() {
        System.out.println("Se verifică buletinul și adeverința de la muncă pentru clientul persoană fizică.");
    }
}
