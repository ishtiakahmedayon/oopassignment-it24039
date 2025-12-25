import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    
    public static TreeMap<String, Integer> countWordFrequencies(String text) {
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();
        
        if (text == null || text.trim().isEmpty()) {
            return frequencyMap;
        }
        
        String[] words = text.toLowerCase()
                             .replaceAll("[^a-zA-Z0-9\\s]", "")
                             .split("\\s+");
        
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        return frequencyMap;
    }
    
    public static void displayFrequencies(TreeMap<String, Integer> frequencyMap) {
        System.out.println("\n=== Word Frequency Analysis ===");
        System.out.println("Total unique words: " + frequencyMap.size());
        System.out.println("\nWord\t\t\tFrequency");
        System.out.println("------------------------------------");
        
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.printf("%-20s\t%d\n", entry.getKey(), entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Word Frequency Counter using TreeMap ===\n");
        
        String sampleText = "Java is a popular programming language. " +
                           "Java is used for building applications. " +
                           "Programming in Java is fun and Java is powerful.";
        
        System.out.println("Sample Text:");
        System.out.println(sampleText);
        
        TreeMap<String, Integer> frequencies = countWordFrequencies(sampleText);
        displayFrequencies(frequencies);
        
        System.out.println("\n\n--- Interactive Mode ---");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your text (press Enter twice to finish):");
        StringBuilder userText = new StringBuilder();
        String line;
        
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            userText.append(line).append(" ");
        }
        
        if (userText.length() > 0) {
            TreeMap<String, Integer> userFrequencies = countWordFrequencies(userText.toString());
            displayFrequencies(userFrequencies);
        }
        
        scanner.close();
    }
}
