package Udemy.Variables;

public class Main {
    public static void main(String[] args) {
        // Variables -----> Data types
        // - A container which holds data
        // - Data types: int, float, double, char, boolean, String
        // - int: 4 bytes, -2^31 to 2^31-1
        // - float: 4 bytes, 6-7 decimal digits
        // - double: 8 bytes, 15 decimal digits
        // - char: 2 bytes, 0 to 65535
        // - boolean: 1 bit, true or false
        // - String: sequence of characters
        int age = 30;
        float salary = 1000.0f;
        double price = 100;
        byte b = 127;
        short s = 32767;
        char letter = 'A';
        boolean isStudent = true;
        long l = 2003902l;
        int num = 10_000_000;

        char c = 'a';
        c++;
        System.out.println(c);
    }
}
