package Test;

/*
    run()方法不会启动新的线程，这里只有一个主线程，所以顺序执行，只能是 pongping；
    假如这里用start()方法，就会启动新的线程，交替执行，pingpong 和 pongping 都有可能
 */

public class threadOrder {
    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }
    static void pong() {
        System.out.print("pong");
    }
}
