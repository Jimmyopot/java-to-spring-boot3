package Udemy.Inheritance;

class C {
    public void show() {
        System.out.println("in C show");
    }

    public void config() {
        System.out.println("in C config");
    }
}

class D extends C {
    public void show() { // this method is overriding the show method in class C
        System.out.println("in D show");
    }

}

class simpleCalc {
    public int add(int a, int b) {
        return a + b;
    }
}

class advancedCalc extends simpleCalc {
    public int add(int a, int b) { // this method is overriding the add method in class simpleCalc
        return a + b + 1;
    }
}

public class Overriding {
    public static void main(String[] args) {
        // Overriding methods
        D obj = new D();
        obj.show();
        obj.config();

        advancedCalc obj1 = new advancedCalc();
        System.out.println(obj1.add(5, 4));
    }
}
