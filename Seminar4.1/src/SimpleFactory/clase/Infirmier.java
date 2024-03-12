package SimpleFactory.clase;

public class Infirmier extends PersonalSpital{
    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }
    public void afisareDetalii(){

        System.out.println("Infirmierul " + getNume()+ " este la spital");

    }
}
