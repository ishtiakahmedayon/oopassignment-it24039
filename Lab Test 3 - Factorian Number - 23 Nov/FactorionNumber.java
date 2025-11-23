import java.util.Scanner;

class FactorionChecker {
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static boolean isFactorion(int number) {
        int originalNumber = number;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    
    public static int[] findFactorionsInRange(int lowerBound, int upperBound) {
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isFactorion(i)) {
                count++;
            }
        }
        
        int[] factorions = new int[count];
        int index = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isFactorion(i)) {
                factorions[index++] = i;
            }
        }
        
        return factorions;
    }
}

public class FactorionNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        
        if (lowerBound > upperBound) {
            System.out.println("Error: Lower bound must be less than or equal to upper bound.");
            scanner.close();
            return;
        }
        
        int[] factorions = FactorionChecker.findFactorionsInRange(lowerBound, upperBound);
        
        System.out.println("Factorion numbers in the range:");
        if (factorions.length == 0) {
            System.out.println("No factorion numbers found in the given range.");
        } else {
            for (int factorion : factorions) {
                System.out.println(factorion);
            }
        }
        
        scanner.close();
    }
}
