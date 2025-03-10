package Udemy.JavaCollections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamApi {
    public static void main(String[] args) {
        // Stream API: introduced in Java 8
        // Stream: sequence of elements supporting sequential and parallel aggregate operations
        // Stream operations: intermediate and terminal operations
        // Intermediate operations: filter, map, sorted, distinct
        // Terminal operations: forEach, collect, reduce, count, anyMatch, allMatch, noneMatch, findFirst, findAny

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        // remove odd numbers, multiply the even numbers by 2 then add them

        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) { // even number
                n = n * 2;
                sum = sum + n;
            }
        }
        System.out.println(sum);

        System.out.println("_".repeat(30));

        Consumer<Integer> consumer = n -> System.out.println(n);

        nums.forEach(consumer);

        // STREAM API
        // you can't reuse a stream
        System.out.println("_".repeat(50));

//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n * 2);
//        int result = s3.reduce(0, (n1, n2) -> n1 + n2);

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(result);
//        s3.forEach(n -> System.out.println(n));


        System.out.println("_".repeat(50));

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

    }
}
