package SimpleFactory.clase;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }
    public void afisareDetalii(){
        System.out.println("Asistentul " + getNume()+ " este la spital");
    }
}
