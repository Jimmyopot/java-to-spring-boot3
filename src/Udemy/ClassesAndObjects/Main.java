package Udemy.ClassesAndObjects;

class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
}

class Computer {
    public void playMusic() {
        System.out.println("Playing music");
    }

    public String getMeAPencil(int cost) {
        if (cost >= 10)
            return "Pencil";
        else
            return "Not enough money";
    }
}

public class Main {
    public static void main(String[] args) {
        //class                  // object
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 10);
        int result2 = (int) calculator.add(5.6, 10.6, 5.6);
        System.out.println(result);

        Computer computer = new Computer();
        computer.playMusic();
        System.out.println(computer.getMeAPencil(5));
    }

}
