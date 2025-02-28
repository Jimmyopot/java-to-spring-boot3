package Udemy.JavaInterface;

// class to class -> extends
// class to interface -> implements

interface Demo {
    int age = 13;
    String area = "Tokyo";
    void show();
    void config();
}

interface Demo2 {
    void run();
}

interface Demo3 extends Demo2 {
    void display();
}

class B implements Demo, Demo2 {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    @Override
    public void run() {
        System.out.println("running...");
    }
}
