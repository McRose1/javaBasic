package Inheritance;

/*
    父类--静态变量
    父类--静态初始化块
    子类--静态变量
    子类--静态初始化块
    父类--变量
    父类--初始化块
    父类--构造器
    子类--变量
    子类--初始化块
    子类--构造器
    可以注意到一点，并不是父类完全初始化完毕后才进行子类的初始化，实际上子类的静态变量和静态初始化块的初始化是在父类的变量、初始化块和构造器初始化之前就完成了。
    那么对于静态变量和静态初始化块之间、变量和初始化块之间的先后顺序又是怎样呢？
    是否静态变量总是先于静态初始化块，变量总是先于初始化块就被初始化了呢？实际上这取决于它们在类中出现的先后顺序。
 */

public class InitialOrderTest {
    public static void main(String[] args) {
        new SubClass();
    }
}

class Parent {
    // 静态变量
    public static String p_StaticField = "父类--静态变量";
    // 变量
    public String p_Field = "父类--变量";
    // 静态初始化块
    static {
        System.out.println(p_StaticField);
        System.out.println("父类--静态初始化块");
    }
    // 初始化块
    {
        System.out.println(p_Field);
        System.out.println("父类--初始化块");
    }
    // 构造器
    public Parent() {
        System.out.println("父类--构造器");
    }
}

class SubClass extends Parent {
    // 静态变量
    public static String s_StaticField = "子类--静态变量";
    // 变量
    public String s_Field = "子类--变量";
    // 静态初始化块
    static {
        System.out.println(s_StaticField);
        System.out.println("子类--静态初始化块");
    }
    // 初始化块
    {
        System.out.println(s_Field);
        System.out.println("子类--初始化块");
    }
    // 构造器
    public SubClass() {
        System.out.println("子类--构造器");
    }
}