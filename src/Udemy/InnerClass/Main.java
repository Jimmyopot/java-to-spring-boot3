package Udemy.InnerClass;

class A {
    private int age;

    public void show() {
        System.out.println("in show");
    }

    class B {
        public void config() {
            System.out.println("in config");
        }
    }

    // Inner class can access private members of the outer class
    static class C { // you can only have static inner class here
        public void config() {
            System.out.println("in config");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Inner class
        // - a class inside another class
        // - can be private, public, protected, or default
        // - can access all members of the outer class, including private members
        // - can be static or non-static
        // - can be abstract or final
        // - can extend any class and implement interfaces
        // - can't have static variables
        // - can't have static methods
        // - can't have static blocks
        // - can't have top-level class access modifier
        // - can't have abstract methods
        // - can't have interface methods
        // - can't have enum methods
        // - can't have enum constructors

        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = new A.C(); // static inner class
        obj2.config();
    }
}
