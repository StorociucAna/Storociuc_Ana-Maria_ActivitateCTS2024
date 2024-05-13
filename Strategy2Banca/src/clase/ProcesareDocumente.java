package clase;

public class ProcesareDocumente {
    private VerificareActeStrategy verificareActeStrategy;

    public void setVerificareActeStrategy(VerificareActeStrategy verificareActeStrategy) {
        this.verificareActeStrategy = verificareActeStrategy;
    }

    public void efectuareProces(){
        if(verificareActeStrategy != null){
            verificareActeStrategy.verificareActe();
        }else{
            System.out.println("Nu s-a setat nicio strategie pentru verificarea actelor.");
        }
    }
}
