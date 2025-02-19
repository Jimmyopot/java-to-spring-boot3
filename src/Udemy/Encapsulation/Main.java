package Udemy.Encapsulation;

class Human {
    private int age;
    private String name;

    public Human() {
        this.age = 0;
        this.name = "Unknown";
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        // this rep current object (instance variable)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Encapsulation
        // - bundling the data (variables) and the methods (functions) that operate on the data into a single unit (class)
        // - data hiding
        // - access modifiers: public, private, protected, default

        // class
        // - a blueprint for objects
        // - a template for objects
        // - a user-defined data type
        // - a collection of fields (data) and methods (functions)

        // object
        // - an instance of a class
        // - a runtime entity
        // - a reference (variable) of a class

        // Encapsulation
        // - data hiding
        // - data abstraction
        // - data encapsulation

        // Encapsulation
        // - private fields
        // - public

        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
        obj.setAge(25);
        obj.setName("John");
        System.out.println(obj.getName() + " : " + obj.getAge());

        Human obj2 = new Human(30, "Jane");
        System.out.println(obj2.getName() + " : " + obj2.getAge());

        Human obj3 = new Human("Tommy");
        System.out.println(obj3.getName());
    }
}
