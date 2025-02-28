package Udemy.ClassesAndObjects;

import other.A;

public class AccessModifiers {

    class Launch {
        public  void abc() {
            A obj = new A();
            System.out.println(obj.marks);
        }
    }
    public static void main(String[] args) {
        // Access Modifiers
        // - public: accessible from anywhere
        // - private: accessible only within the class
        // - protected: accessible within the package and outside the package through inheritance
        // - default: accessible only within the package

        // Access Modifiers
        // - data hiding
        // - data abstraction
        // - data encapsulation

        A obj = new A();
        obj.marks = 10;
        System.out.println(obj.marks);
    }
}
