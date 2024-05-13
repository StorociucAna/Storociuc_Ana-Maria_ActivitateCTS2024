package clase;

public class Plata {
    private ModPlata modPlata;

    public Plata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void efectueazaPlata(double suma){
        modPlata.plateste(suma);
    }
}
