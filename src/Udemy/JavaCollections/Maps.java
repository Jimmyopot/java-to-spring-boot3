package Udemy.JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Map: key-value pair
        // keys cannot be duplicate, only values can be duplicate
        // HashMap: no order, no duplicates
        // LinkedHashMap: maintains order of insertion
        // TreeMap: sorted order

        Map<String, Integer> students = new HashMap<>();
        students.put("John", 85);
        students.put("Jane", 90);
        students.put("Jack", 80);
        students.put("Jill", 95);
        students.put("Jim", 75);

        System.out.println(students.keySet());

        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }

    }
}
