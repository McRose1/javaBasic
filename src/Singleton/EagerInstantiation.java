package Singleton;

public class EagerInstantiation {
    public static void main(String[] args) {
        // 是同一个对象，地址相同
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
    }
}

class Bank {

    // 1. 私有化类的构造器
    private Bank() {

    }

    // 2. 内部创建类的对象
    // 4. 要求此对象也必须声明为静态的
    private static Bank instance = new Bank();

    // 3. 提供公共的静态方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    }
}
