package Udemy.ClassesAndObjects;

public class WrapperClass {
    public static void main(String[] args) {
        // int -> Integer
        // float -> Float
        // char -> Character
        // boolean -> Boolean

        int num = 7;
        Integer num1 = num; // auto-boxing

        int num2 = num1; // auto-unboxing

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 2);
    }
}
