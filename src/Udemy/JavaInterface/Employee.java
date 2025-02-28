package Udemy.JavaInterface;

//abstract class Computer {
//    public abstract void code();
//}

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run...");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run: FASTER...");
    }
}

class Developer implements Computer {
    public void devApp(Computer lap) {
        lap.code();
    }

    @Override
    public void code() {

    }
}
public class Employee {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer jimmy = new Developer();
        jimmy.devApp(lap);
    }
}
