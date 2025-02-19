package Youtube;

import other.A;

public class AccessModifiers {
    public static void main(String[] args) {
        //PUBLIC
        // If you want to access a method outside a folder, always make it public
        A obj = new A();
        System.out.println(obj.marks);
    }
}

class C extends A {
    public  void abc() {
        System.out.println(marks2);
    }
}