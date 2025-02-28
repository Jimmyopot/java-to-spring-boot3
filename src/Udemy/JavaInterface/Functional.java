package Udemy.JavaInterface;

@FunctionalInterface // means there is only one abstract method
interface A1 {
    void show(int i, int j);
}

//class B1 implements A1 {
//    public void show() {
//        System.out.println("in B show");
//    }
//}

public class Functional {
    public static void main(String[] args) {
        A1 obj = new A1() {
            public void show(int i, int j) {
                System.out.println("in B show " + i + j);
            }
        };
        obj.show(5, 6);

        // LAMBDA EXPRESSION

        A1 obj2 = (i, j) -> System.out.println("in B show " + i);
        // this is syntactic sugar, reducing the boilerplate code
        obj2.show(87, 6);
    }
}
