package Udemy.Loops;

public class For {
    public static void main(String[] args) {
        // For loop
        // - repeats a block of code a specified number of times
        // - for (statement1; statement2; statement3) { code block }
        // - statement1: executed before the loop starts
        // - statement2: defines the condition for executing the loop
        // - statement3: executed each time after the loop has been executed
        // - for (int i = 0; i < 5; i++) { System.out.println(i); }
        // - for (int i = 0; i <= 10; i = i + 2) { System.out.println(i); }
        // - for (int i = 10; i >= 0; i--) { System.out.println(i); }

        for (int i = 0; i <= 4; i++) {
            System.out.println("Hi " + i);

            for (int j = 0; j < 3; j++) {
                System.out.println("Hello " + j);
            }
        }
        System.out.println("Bye");

        System.out.println("-".repeat(30));

        for (int i = 1; i <= 5; i++) {
            System.out.println("DAY" + i);

            for (int j = 1; j <= 9; j++) {
                System.out.println(" " + (j+8) + " - " + (j+9));
            }
        }
    }
}
