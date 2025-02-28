package Udemy.JavaEnums;

enum Status { // Status is a class
    RUNNING, FAILED, PENDING, SUCCESS // these are constants or objects
}

enum Laptop {
    MACBOOK(5000), DELL(2000), HP(3000), LENOVO(2800), ACER(1700), THINKPAD(3500);

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Enum
        // - a special "class" that represents a group of constants (unchangeable variables, like final variables)
        // - enum can be a standalone or can be defined within a class
        // - enum can have fields, constructors, and methods
        // - enum may implement many interfaces
        // - enum cannot be used to create objects
        // - enum can have fields, constructors, and methods
        // - enum constants are public, static, final
        // - enum can be defined inside a class
        // - enum can be passed as an argument to switch statement
        // - enum can have abstract methods
        // - enum can have concrete methods
        // - enum can have a constructor
        // - enum can override methods
        // - enum can implement an interface

        Status s = Status.RUNNING;
        Status[] s1 = Status.values();

        System.out.println(s.ordinal());
        System.out.println(s1[3]);

        System.out.println("_".repeat(30));
        for (Status status : s1) {
            System.out.println(status.ordinal() + ": " +status);
        }

        System.out.println("_".repeat(30));

        Status s2 = Status.PENDING;
        switch (s2) {
            case RUNNING:
                System.out.println("Running...");
                break;
            case FAILED:
                System.out.println("Failed...");
                break;
            case PENDING:
                System.out.println("Pending...");
                break;
            case SUCCESS:
                System.out.println("Success...");
                break;
        }

        System.out.println("_".repeat(30));

        Laptop l = Laptop.MACBOOK;
        System.out.println(l + ": " + l.getPrice());

        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + ": " + laptop.getPrice());
        }
    }
}
