package Udemy.Quiz;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is 2 + 2?", "3", "4", "5", "6", "4");
        questions[1] = new Question(2, "What is 3 + 3?", "6", "7", "8", "9", "6");
        questions[2] = new Question(3, "What is 4 + 4?", "8", "9", "10", "11", "8");
        questions[3] = new Question(4, "What is 5 + 5?", "10", "11", "12", "13", "10");
        questions[4] = new Question(5, "What is 6 + 6?", "12", "13", "14", "15", "12");
    }

    public void playQuiz () {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A. " + q.getOpt1());
            System.out.println("B. " + q.getOpt2());
            System.out.println("C. " + q.getOpt3());
            System.out.println("D. " + q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }
}
