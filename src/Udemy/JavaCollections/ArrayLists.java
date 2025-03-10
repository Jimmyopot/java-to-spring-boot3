package Udemy.JavaCollections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayLists are resizable arrays
        // ArrayLists are part of the Java Collections Framework
        // ArrayLists are implemented using arrays
        // ArrayLists are ordered
        // ArrayLists allow duplicate elements
        // ArrayLists allow random access
        // ArrayLists are not synchronized
        // ArrayLists are not thread-safe

        Collection<Integer> nums = new ArrayList<Integer>();
        // collections work with generics(objects)
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        System.out.println(nums);

        for (int n : nums) {
            System.out.println(n);
        }

    }
}
