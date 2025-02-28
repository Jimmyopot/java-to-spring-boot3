package Udemy.Polymorphism;

class Computer {
    public void boot() {
        System.out.println("Computer is booting up");
    }
}

class Laptop extends Computer {
    public void boot() {
        System.out.println("Laptop is booting up");
    }
}

class D {
    public void show() {
        System.out.println("in D show");
    }

}

class E extends D {

}

public class Main {
    public static void main(String[] args) {
        // Polymorphism
        // - many forms
        // - the ability of an object to take many forms
        // - method overloading
        // - method overriding
        // - compile-time polymorphism
        // - run-time polymorphism

        // Polymorphism
        // - compile-time polymorphism (static binding)
        // - method overloading
        // - method overriding
        // - run-time polymorphism (dynamic binding)
        // - method overriding

        // RUN TIME POLYMORPHISM
        E obj = new E();
        obj.show();

        Computer obj1 = new Laptop();
        // you can create a reference of a parent class and assign an object of a child class
        obj1.boot();

    }
}
