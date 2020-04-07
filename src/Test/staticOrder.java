package Test;

/*
    创建类的静态变量和实例变量都会触发类加载；
    类加载时，如果类中有静态修饰部分，则静态部分按顺序执行；
    第一个静态变量执行的时候，创建了一个对象；创建对象执行了非静态代码块，打印 blockA 一次（创建对象时候不执行静态代码！！！）；
    对象创建完后继续遇到static初始代码块并执行，打印blockB一次；
    然后main方法又创建了一个对象，又打印了blockA一次；类加载时静态代码块只加载一次，所以这里就不再执行了；
    最后的结果为：
    blockA
    blockB
    blockA
 */

public class staticOrder {
    // 初始化静态变量（类的静态变量）
    public static staticOrder t1 = new staticOrder();

    // 执行普通代码块
    {
        System.out.println("blockA");
    }
    // 执行静态代码块
    static {
        System.out.println("blockB");
    }
    // 静态构造函数，调用的时候才加载
    public static void main(String[] args) {
        // 类的实例变量
        staticOrder t2 = new staticOrder();
    }
}
