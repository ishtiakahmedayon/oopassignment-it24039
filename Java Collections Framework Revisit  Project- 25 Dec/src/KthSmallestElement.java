import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthSmallestElement {
    
    public static int findKthSmallest(ArrayList<Integer> list, int k) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        
        if (k < 1 || k > list.size()) {
            throw new IllegalArgumentException("k must be between 1 and " + list.size());
        }
        
        ArrayList<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList.get(k - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(10);
        numbers.add(4);
        numbers.add(3);
        numbers.add(20);
        numbers.add(15);
        
        System.out.println("=== Kth Smallest Element Finder ===\n");
        System.out.println("Original ArrayList: " + numbers);
        
        try {
            for (int k = 1; k <= 3; k++) {
                int result = findKthSmallest(numbers, k);
                System.out.println(k + "th smallest element: " + result);
            }
            
            System.out.println("\n--- Interactive Mode ---");
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter the value of k (1-" + numbers.size() + "): ");
            int k = scanner.nextInt();
            
            int result = findKthSmallest(numbers, k);
            System.out.println("\n" + k + "th smallest element is: " + result);
            
            scanner.close();
            
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
