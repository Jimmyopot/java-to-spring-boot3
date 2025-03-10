package Udemy.JavaCollections;

import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Sorting {
    public static void main(String[] args) {
        // Comparator vs Comparable
        // Comparator: compare() -> specific logic
        // Comparable: compareTo() -> class implements Comparable


        Comparator<Integer> com = new Comparator<Integer>() {
           public int compare(Integer i, Integer j) {
               if (i%10 > j%10) {
                   return 1;
               } else {
                   return -1;
               }
           }
        };

        Comparator<Student> com2 = (i, j) -> i.age > j.age ? 1 : -1;

        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "John"));
        students.add(new Student(12, "Jane"));
        students.add(new Student(18, "Jack"));
        students.add(new Student(20, "Jill"));

//        Collections.sort(nums, com);
        Collections.sort(students, com2);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
