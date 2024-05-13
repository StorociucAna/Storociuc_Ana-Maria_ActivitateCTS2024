package clase;

public class VerificareActePersoanaJuridica implements VerificareActeStrategy{
    @Override
    public void verificareActe() {
        System.out.println("Se verifică actele de înființare a firmei și dovada înregistrării la Registrul Comerțului pentru clientul persoană juridică.");
    }
}
