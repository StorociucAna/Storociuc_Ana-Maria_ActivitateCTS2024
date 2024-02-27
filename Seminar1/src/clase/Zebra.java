//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package clase;

import java.io.PrintStream;

public class Zebra extends Animal {
    public Zebra(String name, int age) {
        super(name, age);
    }

    public void eat(String food) {
        PrintStream var10000 = System.out;
        String var10001 = this.getName();
        var10000.println("The zebra " + var10001 + " eats " + food);
    }
}
