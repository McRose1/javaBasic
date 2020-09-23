package Serialization;

/*  对象流的使用
    ObjectInputStream / ObjectOutputStream
    作用：用于存储和读取基本数据类型数据或对象的处理流
 */

import java.io.*;

public class ObjectStream {

    // Serialization
    public static void testObjectOutputStream() {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));

            oos.writeObject(new Person("诸家业", 24));

            // 刷新操作
            oos.flush();
        }

        catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Deserialization
    public static void testObjectInputStream() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Person p = (Person) ois.readObject();

            System.out.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        testObjectOutputStream();
        testObjectInputStream();
    }
}
