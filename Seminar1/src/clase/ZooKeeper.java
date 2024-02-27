//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package clase;

public class ZooKeeper {
    private String name;

    public void feedAnimal(Animal animal, String food) {
        animal.eat(food);
    }

    public ZooKeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
