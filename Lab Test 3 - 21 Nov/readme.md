# General Knowledge Quiz

## Code:
### GeneralKnowledgeQuiz.java
```

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
```

### questions.txt
```
What is the capital of France?|Paris|London|Berlin|Madrid|1
Who wrote Romeo and Juliet?|Charles Dickens|William Shakespeare|Jane Austen|Mark Twain|2
What is the chemical symbol for water?|H2O|CO2|O2|NaCl|1
Which planet is known as the Red Planet?|Venus|Mars|Jupiter|Saturn|2
What is the largest ocean on Earth?|Atlantic Ocean|Indian Ocean|Arctic Ocean|Pacific Ocean|4
Who painted the Mona Lisa?|Van Gogh|Picasso|Leonardo da Vinci|Michelangelo|3
What is the square root of 64?|6|7|8|9|3
Which country is famous for the Eiffel Tower?|Italy|France|Spain|Germany|2
How many hours are in a day?|12|24|36|48|2
What is the fastest land animal?|Lion|Cheetah|Horse|Tiger|2
```

