package Udemy.JavaExceptions;

// Custom Exception
class JimmyException extends Exception {
    public JimmyException(String string) {
        super(string);
    }
}

public class Main {
    public static void main(String[] args) {
        // COMPILE TIME ERROR
        // **** RUN TIME ERROR -> EXCEPTION handling
        // LOGICAL ERROR

        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try {
            j = 0/i;
            if (j == 0) {
                throw new JimmyException("This is not possible");
                // throw keyword is used to throw an exception explicitly
            }

            System.out.println(str.length());
            System.out.println(nums[0]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        } catch (Exception e) { // ******************this is parent class of all exceptions
            System.out.println("Error: " + e);
        }
        System.out.println(9 + 3);

        // Try with resources
        try {
            j = 0/i;
        } finally {
            // this block will always run
            // even if there is an exception or not
            System.out.println("This is finally block");
        }

    }
}
