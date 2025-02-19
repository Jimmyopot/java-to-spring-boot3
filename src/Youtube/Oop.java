package Youtube;

public class Oop {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int result = num1 * num2;
        System.out.println(result);

        // Youtube.Calculator
        Calculator calc = new Calculator();
        double result2 = calc.add(4.5, 5.4);
        System.out.println("Total is " + result2);

        // Youtube.Computer
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMeAPen(4);
        System.out.println(str);

        // Youtube.Mobile
        Mobile mobile1 = new Mobile("iPhone 15", 56000, "Smart phone");
        Mobile mobile2 = new Mobile("Tecno", 25000, "Smart phone");

        System.out.println(mobile1.brand);
        System.out.println(mobile2.price);
    }
}





class Calculator {
    int x;
    int y;

    // This is METHOD OVERLOADING -> using same methods in class but different parameters
    public int add(int x, int y) {
        return  x + y;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public double add(double f, double g) {
        return f + g;
    }

}


class Computer {
    public void playMusic() {
        System.out.println("Music playing...");
    }

    public String getMeAPen(int cost) {
        if(cost >= 10) {
            return "Pen";
        } else {
            return "Nothing";
        }

    }
}

class Mobile {
    String brand;
    int price;
    String name;

    public Mobile(String brand, int price, String name) {
        this.brand = brand;
        this.price = price;
        this.name = name;
    }
}