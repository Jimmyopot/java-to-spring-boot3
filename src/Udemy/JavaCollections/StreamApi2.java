package Udemy.JavaCollections;

import java.util.List;

public class StreamApi2 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(4, 5, 7, 3, 2, 6);

         int result = nums.stream()
                 .filter(n -> n % 2 == 0)
                 .sorted()
                 .map(n -> n * 2)
                 .reduce(0, (n1, n2) -> n1 + n2);

            System.out.println(result);
    }
}
