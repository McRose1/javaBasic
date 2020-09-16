package Keyword;

class Vehicle {

    int maxSpeed;

    Vehicle() {
        System.out.println("Vehicle constructor");
    }

    Vehicle(int maxSpeed) {
        System.out.println("Vehicle constructor with speed");
        this.maxSpeed = maxSpeed;
    }

    public void vroom() {
        System.out.println("Vroom vroom");
    }

}

class Car extends Vehicle {

    int maxSpeed = 100;

    // Constructors
    Car () {

        // 必须在最前面
        super();

        System.out.println("Car constructor");
    }

    // Variables
    public void display() {
        System.out.println(super.maxSpeed);
    }

    // Methods
    public void vroom() {
        super.vroom();
    }
}

public class Super {

    public static void main(String[] args) {

        Car c = new Car();
        c.display();
        c.vroom();
    }
}
