package Test;

/*
    多态典型的标志,父类引用指向子类对象。
    静态类型在编译期可知，实际类型在运行期可知。
    变量的静态类型是不会发生改变的，而变量实际类型是可以改变的。
    在编译阶段我们看的A类，所以会输出0，在执行函数的时候看的是B类，所以会输出B
    成员变量，静态方法：看左边；
    非静态方法：编译看左边，运行看右边
 */

public class extendOrder {
    public static void main(String[] args){
        // 父类引用指向子类对象
        // 编译时类型为 A
        // 运行时类型为 B
        // 在这个引用变量classA指向的对象中，他的成员变量和静态方法与父类是一致的，他的非静态方法，在编译时是与父类一致的，运行时却与子类一致（发生了复写)
        A classA = new B();
        System.out.println(classA.a);
        classA.fun();
    }

    public static class A {
        public int a = 0;

        public void fun(){
            System.out.println("A");
        }
    }
    // B 继承 A
    public static class B extends A {
        public int a = 1;

        public void fun() {
            System.out.println("B");
        }
    }
}
