package Udemy.Variables;

class Mobile {
    String brand;
    int price;
    static String name; // belongs to class not object

    static {
        name = "iPhone 12";
        System.out.println("In static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show() {
        System.out.println(brand + " " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " " + obj.price + " : " + name);
    }
}

public class StaticVariable {
    public static void main(String[] args) throws ClassNotFoundException {
        // Static variable
        // - a variable that belongs to the class and not to object(instance)
        // - a single copy to be shared by all instances of the class
        // - a static variable is initialized only once at the start of the execution
        // - a static variable is created when the program starts and destroyed when the program stops
        // - a static variable is declared using the static keyword
        // - a static variable is called by CLASS NAME not by object reference

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;
        Mobile.name = "iPhone 16";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 800;
        Mobile.name = "Galaxy S20";



        obj1.show();
        obj2.show();

        // Static method
        Mobile.show1(obj1);

        Class.forName("Udemy.Variables.Mobile");
    }
}
