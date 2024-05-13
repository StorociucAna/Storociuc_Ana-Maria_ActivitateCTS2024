package clase;

public class ModulCreareCont {
    private Client client;

    public ModulCreareCont(Client client) {
        this.client = client;
    }

    public boolean poateCreaCont(){
        if(!client.isEsteMajor()){
            System.out.println("Nu este major");
            return false;
        }
        if(client.isEsteUrmaitDePolitie()){
            System.out.println("Este urmait de politie");
            return false;
        }
        if(client.isAreCreanteLaBanci()){
            System.out.println("Are creante la alte banci");
            return false;
        }
        return true;
    }
}
