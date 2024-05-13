package clase;

public class GestiuneStarePacient {
    private StarePacient stare;

    public GestiuneStarePacient() {
        stare = new Internat();
    }

    public void setStare(StarePacient stare) {
        this.stare = stare;
    }
    public void afiseazaStarePacient(){
        stare.afiseazaStare();
    }
}
