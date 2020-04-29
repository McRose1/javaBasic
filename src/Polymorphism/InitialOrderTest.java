package Polymorphism;

/*  ABab2ab2
    执行顺序为：父类静态代码块 --> 子类静态代码块 --> 父类无参构造方法 --> 子类无参构造方法
    且静态代码块在初始化时仅执行一次
 */

public class InitialOrderTest {
    public static void main(String[] args) {
        A ab = new B();
        ab.say();
        ab = new B();
        ab.say();
    }
}
class A {
    static {
        System.out.print("A");
    }
    public A() {
        System.out.print("a");
    }
    void say() {
        System.out.print("1");
    }
}
class B extends A {
    static {
        System.out.print("B");
    }
    public B() {
        System.out.print("b");
    }
    void say() {
        System.out.print("2");
    }
}
