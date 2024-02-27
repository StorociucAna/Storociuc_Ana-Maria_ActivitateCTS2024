//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package clase;

import java.util.HashMap;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Ion");
        Zoo zoo = new Zoo("Zoo", zooKeeper, new HashMap());
        Animal anotherAnimal = new Zebra("Marty", 21);
        zoo.addAnimal(anotherAnimal, "grass");
        zoo.addAnimal(new Lion("Simba", 10), "Marty");
        zoo.addAnimal(new Pisica("Tom", 2), "pliculet");
        zoo.feedAnimals();
    }
}
