package Thread;

/*
    start()方法使线程变为就绪状态，线程若获得CPU资源，就只可以执行run方法。
    main()方法是主线程，所以本题主线程、threadOne 、threadTwo执行顺序不确定。
 */

public class DemoThread extends Thread {
    public static void main(String args[]) {
        DemoThread threadOne = new DemoThread();
        DemoThread threadTwo = new DemoThread();
        threadOne.start();
        System.out.print("thread one.");
        threadTwo.start();
        System.out.print("thread two.");
    }
    public void run() {
        System.out.print("Thread.");
    }
}
