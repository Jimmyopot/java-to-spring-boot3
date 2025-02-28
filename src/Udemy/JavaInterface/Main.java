package Udemy.JavaInterface;

public class Main {
    public static void main(String[] args) {
        // Interface
        // - a reference type in Java
        // - similar to class, it is a collection of abstract methods
        // - a class implements an interface, thereby inheriting the abstract methods of the interface
        // - along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types
        // - interfaces cannot have constructors
        // - interface cannot have instance fields
        // - interface methods are implicitly abstract and cannot have a body
        // - interface can extend one or more other interfaces
        // - a class can implement more than one interface
        // - an interface can extend more than one interface

        Demo obj;
        obj = new B();
        obj.show();
        obj.config();
    }
}
