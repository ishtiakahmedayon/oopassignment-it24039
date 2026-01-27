import java.util.Scanner;

public class MathPuzzleQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Elementary Math Quiz!");
        System.out.println("There are 5 questions. Answer them correctly to earn points.\n");

        System.out.println("Q1: What is 7 + 5?");
        if (sc.nextInt() == 12) score++;

        System.out.println("Q2: What is 15 - 8?");
        if (sc.nextInt() == 7) score++;

        System.out.println("Q3: What is 6 * 4?");
        if (sc.nextInt() == 24) score++;

        System.out.println("Q4: What is 20 / 5?");
        if (sc.nextInt() == 4) score++;

        System.out.println("Q5: What is 3 + 4 * 2?");
        if (sc.nextInt() == 11) score++;

        System.out.println("\nQuiz Over! Your total score: " + score + "/5");

        sc.close();
    }
}
