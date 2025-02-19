package Youtube;

public class Operators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        int result = num1 * num2;
        int result1 = num1 % num2;

        System.out.println(result);
        System.out.println(result1);

        System.out.println(num1++);
        System.out.println(++num1);

        // Rational operators
        int x = 1;
        int y = 5;
        int a = 12;
        int b = 9;

        boolean result3 = x > y || a < b;

        System.out.println(result3);

        // Conditional operations
        if(x > 10) {
            System.out.println("Passed");
        } else if (x < 10 && x > 3) {
            System.out.println("You failed!");
        } else {
            System.out.println("Redo the test!");
        }

        // Ternary operators
        int d = 13;
        int e = 39;
        int f = 19;

        String result4 = e > 30 ? "Success" : "Start again";
        System.out.println(result4);
    }
}