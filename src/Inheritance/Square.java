package Inheritance;

public class Square extends Rectangle {

    private double side;

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
