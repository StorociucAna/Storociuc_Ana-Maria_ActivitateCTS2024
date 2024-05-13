package clase;

public class Salon {
    private int paturiLibere;

    public Salon(int paturiLibere) {
        this.paturiLibere = paturiLibere;
    }

    public boolean verificaDisponibilitatePat() {
        if (paturiLibere > 0) {
            System.out.println("Este disponibil un pat în salon.");
            return true;
        } else {
            System.out.println("Nu există paturi disponibile în salon.");
            return false;
        }
    }
}
