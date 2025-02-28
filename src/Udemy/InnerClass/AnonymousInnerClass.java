package Udemy.InnerClass;

class C {
    public void show() {
        System.out.println("in C show");
    }

}

abstract class D {
    public abstract void show();
    public abstract void inConfig();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        C obj = new C() {
            public void show() {
                System.out.println("in new show");
            }

            // Anonymous inner class can't have constructor
            // This is an inner class to C
        };
        obj.show();

        // Abstract class
        // - a class that is declared with the abstract keyword
        // - cannot be instantiated, but can be subclassed
        // - can have fields, constructors, and methods

        D obj1 = new D() {
            public void show() {
                System.out.println("in new E show");
            }

            public void inConfig() {
                System.out.println("in new E config");
            }
        };
        obj1.show();
        obj1.inConfig();
    }
}
