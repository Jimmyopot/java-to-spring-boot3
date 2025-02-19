package Udemy.Arrays;

class Student {
    // instance variables belong to class
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        int nums[] = new int[6];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Jane";
        s2.marks = 95;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Jim";
        s3.marks = 85;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rollno + " " + students[i].name + " " + students[i].marks);
        }

        System.out.println("-".repeat(30));

//        For Each
        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("-".repeat(30));
        for (Student s : students) {
            System.out.println(s.name + " : " + s.marks);
        }
    }
}
