package DataTypes;

public class TypeCasting {
    public static void main(String[] args) {

        widen();
        narrow();
    }

    private static void widen() {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }

    private static void narrow() {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit casting: double to int

        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
