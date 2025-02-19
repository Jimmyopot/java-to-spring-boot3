package Youtube;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Variables
        int num = 3;
        double num2 = 8.9;
        System.out.println(num + num2);

        double marks = 6.5898;
        float marks2 = 90.90f;
        System.out.println(marks + marks2);

        char letter = 'B';
        boolean isStudent = true;
        long l = 2003902l;

        // Type conversions and casting
        byte b = 127;
        int a = 257;
        byte k = (byte) a;  // this is type casting
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);
    }
}