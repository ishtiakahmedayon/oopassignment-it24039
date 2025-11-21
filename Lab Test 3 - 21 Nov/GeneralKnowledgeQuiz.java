import java.io.*;
import java.util.Scanner;

public class GeneralKnowledgeQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 0;
        

        System.out.println("=== HIGH SCHOOL GENERAL KNOWLEDGE QUIZ ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println();
        

        try {
            BufferedReader reader = new BufferedReader(new FileReader("questions.txt"));
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                
                // Display question and options
                totalQuestions++;
                System.out.println("Q" + totalQuestions + ": " + parts[0]);
                System.out.println("1. " + parts[1]);
                System.out.println("2. " + parts[2]);
                System.out.println("3. " + parts[3]);
                System.out.println("4. " + parts[4]);
                
                // Get answer
                System.out.print("Your answer (1-4): ");
                int answer = scanner.nextInt();
                int correct = Integer.parseInt(parts[5]);
                
                // Check answer
                if (answer == correct) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Wrong! Answer was: " + parts[correct] + "\n");
                }
            }
            reader.close();
            
        } catch (IOException e) {
            System.out.println("Error reading questions.txt");
            return;
        }
        

        System.out.println("=================================");
        System.out.println("Player: " + name);
        System.out.println("Score: " + score + "/" + totalQuestions);
        System.out.println("=================================");
        

        try {
            FileWriter writer = new FileWriter("scores.txt", true);
            writer.write(name + " - " + score + "/" + totalQuestions + "\n");
            writer.close();
            System.out.println("Score saved to scores.txt");
        } catch (IOException e) {
            System.out.println("Error saving score");
        }
        
        scanner.close();
    }
}
