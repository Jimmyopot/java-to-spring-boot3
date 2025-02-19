package Udemy.Arrays;

public class JaggedArrays {
    public static void main(String[] args) {
        // Jagged arrays
        // - an array of arrays
        // - int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        // - int x = myNumbers[1][2];
        // - System.out.println(x); // Outputs 7

        int[][] nums = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // 3D array
        int[][][] threeD = new int[3][4][5];
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    threeD[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        for (int[][] n : threeD) {
            for (int[] m : n) {
                for (int o : m) {
                    System.out.print(o + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
