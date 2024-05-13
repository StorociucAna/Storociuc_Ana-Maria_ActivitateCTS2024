package clase;

public class ModulReceptie {
    private Masa masa;

    public ModulReceptie(Masa masa) {
        this.masa = masa;
    }
    public boolean verificaMasa(){
        if(!masa.isEsteLibera()){
            System.out.println("Masa nu este libera.");
            return false;
        }
        if(!masa.isEsteDebarasata()){
            System.out.println("Masa nu este debarasata");
            return false;
        }
        if(!masa.isAuFostPuseServetele()){
            System.out.println("Nu au fost puse servetele");
            return false;
        }
        return true;
    }
}
