package Udemy.JavaThreads;

class A implements Runnable { // in threads have a method called run
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("in A show");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable { // in threads have a method called run
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("in B show");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //Threads
        //1. extends Thread class
        //2. implements Runnable interface
        //3. anonymous class

        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Runnable obj3 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("in C show");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);

        t1.start();
        t2.start();
        t3.start();
    }
}
