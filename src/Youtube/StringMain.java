package Youtube;

public class StringMain {
    public static void main(String[] args) {
        String name = new String("Jimmy");
        System.out.println("Hello " + name);
        System.out.println(name.concat(" Famous"));

        // String buffer -> it is mutable
        StringBuffer sb = new StringBuffer("Dante");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}