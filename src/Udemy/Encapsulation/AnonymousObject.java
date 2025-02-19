package Udemy.Encapsulation;

class A {
    public A() {
        System.out.println("Object created");
    }
    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        // Anonymous object
        // - an object that is created without assigning it to a variable
        // - used when an object is needed only once
        // - used when an object is not needed after its use
        // - used to call methods of a class
        // - used to pass arguments to a method
        // - used to call a constructor
        // - used to pass arguments to a constructor

        int marks;
        marks = 99;

        A obj = new A();
        obj.show();

    }
}
