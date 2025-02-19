package Udemy.Variables;

public class Operators {
    public static void main(String[] args) {
        // Operators
        // - Special symbols that perform specific operations on operands and produce a result
        // - Unary operators: +, -, ++, --, !
        // - Binary operators: +, -, *, /, %
        // - Ternary operators: ?:
        // - Arithmetic operators: +, -, *, /, %
        // - Relational operators: <, >, <=, >=, ==, !=
        // - Logical operators: &&, ||, !
        // - Bitwise operators: &, |, ^, ~, <<, >>
        // - Assignment operators: =, +=, -=, *=, /=, %=
        // - Misc operators: ?:, instanceof, new, ., (type), ::
        // - Precedence: (), ++, --, +, -, !, (type), *, /, %, +, -, <<, >>, >>>, <, >, <=, >=, ==, !=, &, ^, |, &&, ||, ?:

        int num1 = 7;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        // Modulus operator gives you reminder
        int result2 = num1 % num2;
        System.out.println(result2);

        num1++;
        System.out.println(num1);

        int result3 = num1++;   // Post increment
        int result4 = ++num1;   // Pre increment

        // Relational operators
        int x = 6;
        int y = 5;
        boolean result5 = x < y;
        System.out.println(result5);

        double a = 8.8;
        double b = 9.8;
        boolean result6 = a >= b;
        System.out.println(result6);

        // Logical operators
        int c = 7;
        int d = 5;
        int e = 5;
        int f = 9;
        boolean result7 = c > d || e < f;
        System.out.println(result7);
    }
}
