//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package clase;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Zoo {
    private String name;
    private ZooKeeper zooKeeper;
    private Map<Animal, String> animals;

    public void feedAnimals() {
        Iterator var1 = this.animals.entrySet().iterator();

        while(var1.hasNext()) {
            Map.Entry<Animal, String> a = (Map.Entry)var1.next();
            this.zooKeeper.feedAnimal((Animal)a.getKey(), (String)a.getValue());
        }

    }

    public Zoo(String name, ZooKeeper zooKeeper, Map<Animal, String> animals) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }

    public void addAnimal(Animal animal, String food) {
        if (this.animals == null) {
            this.animals = new HashMap();
        }

        this.animals.put(animal, food);
    }
}
