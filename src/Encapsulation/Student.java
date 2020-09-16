package Encapsulation;

public class Student {

    // private variables to users
    // in order to avoid users dealing with variables 
    private String name;
    private int age;

    // public setters and getters methods to users
    // in order to expose variables to users
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
