package Udemy.JavaExceptions;

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("ExceptionThrows");
    }
}

public class ExceptionThrows {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
