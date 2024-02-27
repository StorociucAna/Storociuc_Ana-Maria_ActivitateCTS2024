//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package clase;

import java.io.PrintStream;

public class Pisica extends Animal {
    public Pisica(String name, int age) {
        super(name, age);
    }

    public void eat(String food) {
        PrintStream var10000 = System.out;
        String var10001 = this.getName();
        var10000.println("The pet cat " + var10001 + " eats " + food);
    }
}
