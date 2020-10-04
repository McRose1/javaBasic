package Static;

/*  StaticVariable
    用 static 修饰的变量为全局共享，不依赖与对象而是依赖于类存在
 */

public class StaticVariable {
    static int staticCounter;
    int instanceCounter;
    void counter() {
        staticCounter++;
        instanceCounter++;
    }
    void displayCount() {
        System.out.println("static count " + staticCounter);
        System.out.println("Instance count " + instanceCounter);
    }

    public static void main(String[] args) {
        StaticVariable r1 = new StaticVariable();
        StaticVariable r2 = new StaticVariable();
        StaticVariable r3 = new StaticVariable();
        r1.counter();
        r2.counter();
        r3.counter();
        r3.displayCount();
    }
}
