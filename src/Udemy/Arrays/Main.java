package Udemy.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays
        // - a container object that holds a fixed number of values of a single type
        // - the length of an array is established when the array is created
        // - after creation, its length is fixed
        // - int[] myArray = new int[5];
        // - int[] myArray = {1, 2, 3, 4, 5};
        // - int[] myArray = new int[] {1, 2, 3, 4, 5};
        // - int[] myArray = new int[5];

        int[] nums = {3, 7, 2, 4};
        System.out.println(nums[0]);
        nums[1] = 6;
        System.out.println(nums[1]);

        int[] nums2 = new int[4];
        nums2[0] = 4;
        nums2[1] = 5;
        nums2[2] = 6;
        nums2[3] = 7;
        System.out.println(Arrays.toString(nums2));

        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
    }
}
