package Udemy.Abstract;

abstract class Car {
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing music...");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("WagonR is driving...");
    }

    @Override
    public void fly() {
        System.out.println("WagonR is flying...");
    }
}

class UpdateWagonR extends Car {
    public void drive() {
        System.out.println("UpdateWagonR is driving...");
    }

    @Override
    public void fly() {
        System.out.println("UpdateWagonR is flying...");
    }
}
public class Main {
    // Abstract class
    // - a class that is declared with the abstract keyword
    // - cannot be instantiated, but can be subclassed
    // - can have fields, constructors, and methods
    // - methods in abstract class can be abstract or non-abstract
    // - abstract methods have no body
    // - if a class has an abstract method, then the class must be abstract
    // - if a class is abstract, it does not need to have abstract methods
    // - you can't mark a method as both abstract and final
    // - you can't mark a method as both abstract and static
    // - you can't mark a method as both abstract and private
    // - you can't mark a method as both abstract and native
    // - you can't mark a method as both abstract and synchronized
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();

        Car obj1 = new UpdateWagonR();
        obj1.drive();
        obj1.playMusic();
        obj1.fly();
    }
}
