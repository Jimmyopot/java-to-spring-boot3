package Udemy.Variables;

public class Casting {
    public static void main(String[] args) {
        // Casting
        // - Converting a data type to another data type
        // - Widening Casting (automatically) - converting a smaller type to a larger type size
        // - byte -> short -> char -> int -> long -> float -> double
        // - Narrowing Casting (manually) - converting a larger type to a smaller type size
        // - double -> float -> long -> int -> char -> short -> byte

        float f = 10.5f;
        int x = (int)f;
        System.out.println(x);

        int a = 389;
        byte b = (byte) a;
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        int result = c * d; // This is type promotion

        char ch = 'a';
        char result2 = (char)(ch + 1);
        System.out.println(result2);

        byte b1=5,b2=6;
        byte b3=(byte)(b1+b2);
        System.out.println(b3);
    }
}
