package Udemy.Loops;

public class While {
    public static void main(String[] args) {
        // Loops
        // - Used to execute a set of statements multiple times
        // - for, while, do while
        // - for: repeats a block of code a specified number of times
        // - while: repeats a block of code while a specified condition is true
        // - do while: repeats a block of code while a specified condition is true, and then repeats the loop as long as the condition is true
        // - break: exits a loop
        // - continue: skips the current iteration, and continues with the next iteration

        // While loop
        int i = 1;

        while (i <= 5) {
            System.out.println("Hi " + i);

            int j = 1;
            while (j <= 3) {
                System.out.println("Hello " + j);
                j++;
            }

            i++;
        }
        System.out.println("Bye " + i);

        System.out.println("-".repeat(20));


        // Do while loop
        int k = 0;

        do {
            System.out.println("Do while " + k);
            k++;
        } while (k <= 5);
    }
}
