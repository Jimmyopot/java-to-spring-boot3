package other;

public class A {
    public int marks = 6;
    protected int marks2 = 10;
    private boolean results = false;
    // Private can only be used within the class but not outside...
}

class Launch {
    public  void abc() {
        A obj = new A();
        System.out.println(obj.marks2);
    }
}