package Interface;

interface WaterBottleInterface {

    String color = "Blue";

    void fillUp();
    void pourOut();
}

public class InterfaceTest implements WaterBottleInterface {

    public static void main(String[] args) {
        System.out.println(color);

        InterfaceTest it = new InterfaceTest();
        it.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled");
    }

    @Override
    public void pourOut() {
        System.out.println("It is poured");
    }
}
