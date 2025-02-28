package Udemy.JavaThreads;

class A extends Thread { // in threads have a method called run
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("in A show");
        }
    }
}

class B extends Thread { // in threads have a method called run
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("in B show");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //Threads
        //1. extends Thread class
        //2. implements Runnable interface
        //3. anonymous class

        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
