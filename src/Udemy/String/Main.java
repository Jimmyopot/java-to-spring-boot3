package Udemy.String;

public class Main {
    public static void main(String[] args) {
        // Strings
        // - a sequence of characters
        // - String is a class in Java
        // - Strings are immutable

        String name = new String("John");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Brady"));

        String name2 = "Derrick";
        System.out.println(name2);
    }
}
