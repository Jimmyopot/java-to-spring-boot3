package Youtube;

public class ArrayMain {
    public static void  main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        for(int i=0; i<4; i++) {
            System.out.println(nums[i]);
        }

        //Multi dimensional array
        //- Outer loop iterates the rows
        // - Inner loop iterates the columns
        int arrayNums[][] = new int[3][4];  // the 1st is row the 2nd is column

        for(int i=0; i<3; i++) {  // this is rows
            for(int j=0; j<4; j++) { // this is columns
                System.out.println(arrayNums[i][j] + " ");
            }
            System.out.println();
        }

        int nums2[][] = new int[3][4];

        for(int k=0; k<3; k++) {
            for(int l=0; l<4; l++) {
                nums2[k][l] = (int)(Math.random() * 100);
                System.out.println(nums2[k][l]);
            }
        }

        int nums3[] = new int[4];
        nums3[0] = 32;
        nums3[1] = 42;
        nums3[2] = 91;
        nums3[3] = 12;

        for(int i=0; i<nums3.length; i++) {
            System.out.println(nums3[i]);
        }



        // FOR EACH LOOP
        for(int n : nums3) {
            System.out.println("for each example " + n);
        }
    }
}