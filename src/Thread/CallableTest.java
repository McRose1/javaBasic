package Thread;

import java.util.concurrent.Callable;

public class CallableTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Callable Callable = new CallableExample();

            Thread t = new Thread();
            t.start();
        }
    }
}
