package clase.Factory;

import clase.CategoriaBody;
import clase.CategoriaDurere;
import clase.CategoriaRaceala;
import clase.Medicament;

public class FabricaMedicament {
    public Medicament creeazaMedicament(TipCategorieMedicament tipCategorieMedicament, String denumire, float pret)throws Exception{
        switch(tipCategorieMedicament){
            case BODY:
                Medicament medicamentBody = new CategoriaBody(denumire, pret);
                return medicamentBody;
            case DURERE:
                Medicament medicamentDurere = new CategoriaDurere(denumire, pret);
                return  medicamentDurere;
            case RACEALA:
                Medicament medicamentRaceala = new CategoriaRaceala(denumire, pret);
                return medicamentRaceala;
            default:
                throw new IllegalArgumentException(" unknown tipCategorieMedicament"+ tipCategorieMedicament);
        }
    }
}
