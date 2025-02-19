package Udemy.Inheritance;

// super() executes the constructor of the parent class
// this() executes the constructor of the current class

class A extends Object {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}
class B extends A {
    public B() {
        super(5);
        System.out.println("in B");
    }

    public B(int n) {
        this();
        System.out.println("in B int");
    }
}

public class Main {
    public static void main(String[] args) {
        // Inheritance
        // - a mechanism in which one class acquires the properties and behaviors of another class
        // - the class that is inherited from is called the parent class, super class, or base class
        // - the class that inherits is called the child class, sub class, or derived class
        // - the child class can access all the properties and behaviors of the parent class
        // - the child class can have its own properties and behaviors
        // - the child class can override the properties and behaviors of the parent class
        // - the child class can have its own properties and behaviors
        // - the child class can have its own constructors

        SciCalc obj = new SciCalc();
        int r1 = obj.add(5, 4);
        int r2 = obj.sub(7, 3);
        int r3 = obj.mul(23, 32);
        int r4 = obj.div(r3, r2);
        double r5 = obj.power(5, 4);

        System.out.println(r1 + " " + r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

        B obj1 = new B(3);
        System.out.println(obj1);
    }
}
