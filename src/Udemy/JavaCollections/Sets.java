package Udemy.JavaCollections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // Set: unordered collection of unique elements
        // HashSet: no order, no duplicates
        // LinkedHashSet: maintains order of insertion
        // TreeSet: sorted order

        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(9);
        nums.add(82);
        nums.add(63);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("_".repeat(30));

        // Iterator
        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
