import java.util.Scanner;

public class MathPuzzleQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        String[] questions = {
            "Q1: What is 7 + 5?",
            "Q2: What is 15 - 8?",
            "Q3: What is 6 * 4?",
            "Q4: What is 20 / 5?",
            "Q5: What is 3 + 4 * 2?"
        };

        String[][] options = {
            {"1) 10", "2) 12", "3) 14", "4) 13"},
            {"1) 5", "2) 6", "3) 7", "4) 8"},
            {"1) 20", "2) 22", "3) 24", "4) 26"},
            {"1) 2", "2) 4", "3) 5", "4) 6"},
            {"1) 9", "2) 10", "3) 11", "4) 12"}
        };

        int[] answers = {2, 3, 3, 2, 3}; // Correct option numbers

        System.out.println("Welcome to the Elementary Math Quiz!");
        System.out.println("Select the correct option number (1-4) for each question.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }
            int choice = sc.nextInt();
            if (choice == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Quiz Over! Your total score: " + score + "/5");
        sc.close();
    }
}
