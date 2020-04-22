package Singleton;

public class LazyInstantiation {
    public static void main(String[] args) {
        // 是同一个对象，地址相同
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
    }
}

class Order {

    // 1. 私有化类的构造器
    private Order() {

    }

    // 2. 声明当前类的对象，没有初始化
    // 4. 此对象也必须声明为 static
    private static Order instance = null;

    // 3. 声明public、static 的返回当前类对象的方法
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}