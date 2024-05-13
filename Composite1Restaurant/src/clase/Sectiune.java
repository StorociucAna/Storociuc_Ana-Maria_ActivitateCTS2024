package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements StructuraAbstracta{
    private String nume;
    private List<StructuraAbstracta> sectiuni = new ArrayList<>();

    public Sectiune(String nume) {
        this.nume = nume;
    }
    public void adauga(StructuraAbstracta sectiune){
        sectiuni.add(sectiune);
    }
    public void sterge(StructuraAbstracta sectiune){
        sectiuni.remove(sectiune);
    }

    @Override
    public void afiseaza() {
        System.out.println("Sectiune: " + nume);
        for(StructuraAbstracta sectiune : sectiuni){
            sectiune.afiseaza();
        }
    }
}
