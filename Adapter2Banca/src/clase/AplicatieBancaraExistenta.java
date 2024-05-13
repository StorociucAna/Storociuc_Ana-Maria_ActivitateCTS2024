package clase;

public class AplicatieBancaraExistenta implements AplicatieBancara{
    @Override
    public void oferaCredit(String numeClient, double suma) {
        System.out.println("Credit oferit pentru " + numeClient + " în valoare de " + suma + " lei");
    }
}
