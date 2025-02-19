package Youtube;

public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();

        Calc calc = new Calc();
        int calc1 = calc.add(4, 10);
        int calc2 = calc.sub(65, 23);
        System.out.println("calc1 " + calc1);
        System.out.println("calc2 " + calc2);

        AdvancedCalc advCalc = new AdvancedCalc();
        int advCalc1 = advCalc.multipy(34, 78);
        System.out.println(advCalc1);
    }
}

// This is SUPERCLASS
class A {
    public  A() {
        super(); // Every constructor has super method
        System.out.println("This is Youtube.A");
    }
}

// This is SUBCLASS
class B extends A {
    public B() {
        super();
        System.out.println("This is Youtube.B");
    }
}

class E extends  B {}

// Parent class
class Calc {
    public int add(int n1, int n2) {
        return  n1 + n2;
    }

    public int sub(int n1, int n2) {
        return  n1 - n2;
    }
}

// Child class
class AdvancedCalc extends Calc {
    public int multipy(int n1, int n2) {
        return n1 * n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }
}