package Udemy.Arrays;

class Message{
    public void printMessage(int message) {
        System.out.println("Message primitive: " + message);
    }

    public void printMessage(Integer message) {
        System.out.println("Message object: " + message);
    }
}
public class Quiz {
    public static void main(String[] args) {
        Message ob =new Message();
        ob.printMessage(5);
    }
}
