package Udemy.String;

public class StringBuffer {
    public static void main(String[] args) {
        // StringBuffer
        // - mutable sequence of characters
        // - StringBuffer is a class in Java
        // - StringBuffer is synchronized
        // - StringBuffer is thread-safe
        // - StringBuffer is faster than StringBuilder
        // - StringBuffer is slower than String

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

    }
}
