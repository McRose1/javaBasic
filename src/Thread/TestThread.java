package Thread;

/*  启动多线程失败的例子
    线程的启动方式只能通过start这种方式启动才能真正的实现多线程的效果
    如果是手动调用run方法和普通方法调用没有区别，所以这个还是按照顺序执行首先执行run方法之后，执行输出语句所以最终得到结果foobar.
 */

public class TestThread {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.print("foo");
            }
        };
        Thread t = new Thread(runner);
        t.run();
        System.out.print("bar");
    }
}
