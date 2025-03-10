package Udemy.Quiz;

interface MyCode{
    double myScore();

}

public class Main {
    public static void main(String[] args) {
//        QuestionService service = new QuestionService();
//        service.playQuiz();
//        service.printScore();


        char ch [] = {'T', 'e', 'l', 'u', 's', 'k', 'o'};
        String st1 = new String(ch);
        String st2 = new String(st1);
        System.out.println(st1);
        System.out.println(st2);

        StringBuffer sb = new StringBuffer("Java Code");
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}
