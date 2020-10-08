package Inheritance;

import java.util.*;

public class Comparison {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 2);
        Square square = new Square(2);

        Map<Double, String> map = new HashMap<>();

        double circleArea = circle.getArea();
        map.put(circleArea, "Circle");
        double rectangleArea = rectangle.getArea();
        map.put(rectangleArea, "Rectangle");
        double squareArea = square.getArea();
        map.put(squareArea, "Square");

        double[] areas = new double[] {circleArea, rectangleArea, squareArea};
        Arrays.sort(areas);
        // from min to max
        for (double n : areas) {
            System.out.println(map.get(n));
        }
    }
}
