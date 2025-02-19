package Youtube;

public class Loops {
    public static void main(String[] args) {
        // While loops
        // - Only runs if condition is true, finite times
        int i = 1;

        while(i < 5) {
            System.out.println("Hi there");
            i++;
        }

        // Do While loops
        do {
            System.out.println("Jimmy do this" + i);
            i++;
        }while (i <= 4);

        // For loops
        for(int j=0; j < 5; j++) {
            System.out.println("Telusko" + j);
        }
    }
}