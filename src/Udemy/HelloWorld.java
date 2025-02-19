package Udemy;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        boolean x = !(true || false);
        System.out.println(x);

//        int a, b;
//        a=b=10;
//        System.out.println(a);
//        System.out.println(b);

        int a = 3;
        int b = 6;
        int result = (~a & b) | (a & ~b);
        System.out.println(result);

        int z=2;

        switch(z) {
            case 1:
            case 2:
            case 3:
                System.out.println("Fly");
                break;
            case 4:
                System.out.println("Swim");
        }

        int x1 = 5;
        int y1 = 10;
        int z1 = (x1++ > 5 && y1-- < 10) ? x1-- : y1;
        System.out.println(x1 + ", " + y1 + ", " + z1);

        int i, j;
        i = 100;
        j = 300;
        while(++i < --j);
        System.out.println(i);
    }
}
