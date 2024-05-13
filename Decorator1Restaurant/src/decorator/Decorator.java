package decorator;

import clase.NotaDePlata;
import clase.NotaDePlataAbstracta;

public class Decorator implements NotaDePlataAbstracta {
    private NotaDePlata notaDePlata;

    public Decorator(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
        System.out.println("Felicitare: La Mulți Ani!");
    }
}
