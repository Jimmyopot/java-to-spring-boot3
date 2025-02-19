package Udemy.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        // Multi-dimensional arrays
        // - an array of arrays
        // - int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        // - int x = myNumbers[1][2];
        // - System.out.println(x); // Outputs 7

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

        System.out.println("-".repeat(30));

        int[][] nums = new int[3][4];
        // get random values
        for (int i = 0; i < nums.length; i++) { // rows
            for (int j = 0; j < nums[i].length; j++) { // columns
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < nums.length; i++) { // rows
            for (int j = 0; j < nums[i].length; j++) { // columns
                System.out.print(nums[i][j] + " "); // i is row, j is column
            }
            System.out.println();
        }

        System.out.println("-".repeat(30));

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
