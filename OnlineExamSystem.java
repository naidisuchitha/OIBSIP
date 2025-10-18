package onlineexamsystem;

import java.util.Scanner;

public class OnlineExamSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "1. What is the capital of India?",
            "2. Which language is used for Android development?",
            "3. What does JVM stand for?"
        };

        String[][] options = {
            {"1. Mumbai", "2. Delhi", "3. Bangalore", "4. Kolkata"},
            {"1. Python", "2. Java", "3. C#", "4. Ruby"},
            {"1. Java Virtual Machine", "2. Java Very Much", "3. Just Virtual Method", "4. None"}
        };

        int[] answers = {2, 2, 1}; 
        int score = 0;

        System.out.println(" Welcome to the Online Exam System!");
        System.out.println("Please select the correct option (1-4) for each question.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println(" Correct!\n");
                score++;
            } else {
                System.out.println(" Wrong! The correct answer is option " + answers[i] + "\n");
            }
        }

        System.out.println(" Exam Finished!");
        System.out.println("Your score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
