package Udemy.JavaCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        // Optional: avoid null pointer exception
        // Optional: container object that may or may not contain a non-null value
        List<String> names = Arrays.asList("Nathan", "Laxmi", "John", "Kishor");

        Optional name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst();

        System.out.println(name.orElse("Not found"));
    }
}
