package Final;

public class FinalClass {
    public static void main(String[] args) {
        doSomething(new Car());
    }

    private static void doSomething(final Car aCar) {
        aCar.setColor(new Color(2));
        System.out.println(aCar.color.n);
    }

    static final class Car {
        Color color = new Color(1);

        public Car() {
        }

        public void setColor(Color color) {
            this.color = color;
        }
    }

    static class Color {
        int n;
        public Color(int n) {
            this.n = n;
        }
    }
}
