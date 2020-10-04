package Static;

/*  StaticMethod
    静态类中不能使用非静态变量和非静态方法
 */

public class StaticMethod {
    int data = 100;
    static int d = 200;
    static void test() {

        //System.out.println(data);   -> 错误
        System.out.println(d);
    }
    void regularMethod() {
        System.out.println("You need to create an object to call this method");
    }

    public static void main(String[] args) {
        StaticMethod.test();

        StaticMethod obj = new StaticMethod();
        obj.regularMethod();
    }
}
