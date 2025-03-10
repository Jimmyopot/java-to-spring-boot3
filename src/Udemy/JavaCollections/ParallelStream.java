package Udemy.JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        // Stream API
        // Stream: sequence of elements supporting sequential and parallel aggregate operations
        // Stream pipeline: sequence of stream source, intermediate operations, and terminal operation
        // Stream source: collection, array, generator function, I/O channel
        // Intermediate operation: filter, map, sort, distinct, limit, skip
        // Terminal operation: forEach, toArray, reduce, collect, min, max, count, anyMatch, allMatch, noneMatch, findFirst, findAny

        // Parallel Stream: stream that processes elements in parallel
        // parallelStream() method: returns a possibly parallel stream
        // parallel() method: returns an equivalent parallel stream
        // sequential() method: returns an equivalent sequential stream

        // Stream API vs Parallel Stream
        // Stream API: processes elements sequentially
        // Parallel Stream: processes elements in parallel

        List<Integer> nums = new ArrayList<>(1000);

        int size = 10_000;

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(random.nextInt(100));
        }

        int sum = nums.stream()
                .map(n -> n * 2)
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(sum);

        long startSeg = System.currentTimeMillis();

        int sum2 = nums.stream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();

        long endSeg = System.currentTimeMillis();

        int sum3 = nums.parallelStream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();

        long endPara = System.currentTimeMillis();

        System.out.println(sum2 + " " + sum3);
        System.out.println("Sequential: " + (endSeg - startSeg) + "ms");
        System.out.println("Parallel: " + (endPara - endSeg) + "ms");
    }
}
