package Abstract;

abstract class Dog {

    String breed;

    public void bark() {
        System.out.println("Bark!");
    }

    public abstract void poop();
}

class Chihuahua extends Dog {

    @Override
    public void poop() {
        System.out.println("Dog pooped!");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();

        c.bark();
        c.poop();
    }
}
