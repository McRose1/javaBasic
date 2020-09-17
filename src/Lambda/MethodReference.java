package Lambda;

public class MethodReference {

    public static void main(String[] args) {

        // printMessage();
        // Thread t = new Thread(() -> printMessage());

        // Method Reference
        Thread t = new Thread(MethodReference::printMessage);  // () -> method()
        t.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
