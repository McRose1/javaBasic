package Lambda;

/*
    利用接口初始化 lambda 的前提条件是该接口只有一个 abstract method
    如 Runnable，这样的 interface 也被称为 Functional Interface
 */

public class Runnable {

    public static void main(String[] args) {
        // anonymous inner class
        Thread myThread = new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });
        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
        myLambdaThread.run();

    }
}


