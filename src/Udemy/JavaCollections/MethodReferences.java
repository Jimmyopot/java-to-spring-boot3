package Udemy.JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student1 {
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MethodReferences {
    public static void main(String[] args) {
        // Method References
        // 1. Static method reference
        // 2. Instance method reference
        // 3. Constructor reference

        List<String> names = Arrays.asList("Nathan", "Helle", "John", "Kishor");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase) // this is a method reference
                .toList();

        upperCaseNames.forEach(System.out::println);


        // CONSTRUCTOR REFERENCE
        List<Student1> students = new ArrayList<>();

//        for (String name : names) {
//            students.add(new Student1(name, name.length()));
//        }

        students = names.stream()
                .map(name -> new Student1(name, name.length()))
                .toList();

        students.forEach(System.out::println);
    }
}
