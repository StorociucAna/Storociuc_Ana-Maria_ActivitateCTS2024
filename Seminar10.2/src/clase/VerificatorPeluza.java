package clase;

public class VerificatorPeluza implements Verificator{
    @Override
    public void verifica(String nume) {
        System.out.println("Se verifica bagajele si corporal pe " + nume );
    }
}
