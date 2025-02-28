package Udemy.Inheritance;

import java.util.Objects;

class Laptop {
    public String model;
    public int price;

    public String toString() {
        return model + ": " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (price != laptop.price) return false;
        return Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        // Object class
        // - the root class for all classes in Java
        // - it is the parent class for all classes
        // - it is present in java.lang package
        // - it is the topmost class in the class hierarchy
        // - it is the only class that has no parent
        // - it is the only class that has no child
        // - it is the only class that has no methods
        // - it is the only class that has no properties
        // - it is the only class that has no constructors
        // - it is the only class that has no interfaces
        // - it is the only class that has no abstract methods

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1500;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1500;

        boolean result = obj1.equals(obj2);
        System.out.println(result);
    }

}
