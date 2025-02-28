package Udemy.Variables;

final class Calc { // this class cannot be inherited
    public void show() {
        System.out.println("in Calc show");
    }

    public final void add(int a, int b) { // this method cannot be overridden
        System.out.println(a + b);

    }
}

//class AdvCalc extends Calc { // These are the errors!
//    public void add(int a, int b) {
//        System.out.println(a + b + 1);
//    }
//}

public class Final {
    public static void main(String[] args) {
        // Final keyword
        // - final keyword is used to restrict the user
        // - final can be used in variables, methods, and classes
        // - final variable: value cannot be changed
        // - final method: method cannot be overridden
        // - final class: class cannot be inherited
        // - final method can be overloaded
        // in Javascript its const

        final int num = 8;
        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(5, 4);
    }
}
