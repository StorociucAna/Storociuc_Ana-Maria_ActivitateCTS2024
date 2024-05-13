package clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subiect{
    private List<Observer> pacienti = new ArrayList<>();

    @Override
    public void aboneaza(Observer observer) {
        pacienti.add(observer);
    }

    @Override
    public void dezaboneaza(Observer observer) {
        pacienti.remove(observer);
    }

    @Override
    public void notifica(String mesaj) {
        for(Observer observer : pacienti){
            observer.update(mesaj);
        }
    }
    public void apareEpidemie(String tipEpidemie){
        notifica("Epidemie de "+ tipEpidemie + "! Luati masurile necesare.");
    }
}
