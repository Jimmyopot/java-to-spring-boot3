package Udemy.Variables;

public class ConditionalStatements {
    public static void main(String[] args) {
        // Conditional Statements
        // - Used to perform different actions based on different conditions
        // - if, if else, else if, switch
        // - if: executes a block of code if the condition is true
        // - if else: executes a block of code if the condition is true and another block if it is false
        // - else if: executes a block of code if the condition is true
        // - switch: selects one of many code blocks to be executed
        // - Ternary operator: shorthand for if else statement
        // - Syntax: condition ? statement1 : statement2

        int x = 5;
        int y = 7;
        int z = 6;

        if (x > y && x > z) {
            System.out.println("Hello");
        } else if (y > x && y > z) {
            System.out.println("Hi");
        } else {
            System.out.println("Bye");
        }

        // Ternary operator
        int n = 4;
        int result = n % 2 == 0 ? 10 : 20;

        System.out.println(result);

        // Switch statement
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Invalid day");
        }
    }
}
