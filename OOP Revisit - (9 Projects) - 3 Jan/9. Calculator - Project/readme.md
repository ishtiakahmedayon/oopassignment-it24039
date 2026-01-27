# Calculator

### Code:
```
import java.util.Scanner;

class Calculator {
    double add(double a, double b) {
        return a + b;
    }
    
    double subtract(double a, double b) {
        return a - b;
    }
    
    double multiply(double a, double b) {
        return a * b;
    }
    
    double divide(double a, double b) {
        if(b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
    
    double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    double squareRoot(double number) {
        if(number >= 0) {
            return Math.sqrt(number);
        } else {
            System.out.println("Error: Cannot calculate square root of negative number!");
            return 0;
        }
    }
    
    double percentage(double number, double percent) {
        return (number * percent) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.println("=== Advanced Calculator ===");
        
        while(true) {
            System.out.println("\nOperations:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (^)");
            System.out.println("6. Square Root (√)");
            System.out.println("7. Percentage (%)");
            System.out.println("8. Exit");
            System.out.print("Select operation: ");
            
            int choice = sc.nextInt();
            
            if(choice == 8) {
                System.out.println("Thank you for using Calculator!");
                break;
            }
            
            double num1, num2, result = 0;
            
            switch(choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = calc.add(num1, num2);
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                    
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = calc.subtract(num1, num2);
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                    
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = calc.multiply(num1, num2);
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                    
                case 4:
                    System.out.print("Enter numerator: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter denominator: ");
                    num2 = sc.nextDouble();
                    result = calc.divide(num1, num2);
                    if(num2 != 0) {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;
                    
                case 5:
                    System.out.print("Enter base: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = sc.nextDouble();
                    result = calc.power(num1, num2);
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                    break;
                    
                case 6:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    result = calc.squareRoot(num1);
                    if(num1 >= 0) {
                        System.out.println("Result: √" + num1 + " = " + result);
                    }
                    break;
                    
                case 7:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter percentage: ");
                    num2 = sc.nextDouble();
                    result = calc.percentage(num1, num2);
                    System.out.println("Result: " + num2 + "% of " + num1 + " = " + result);
                    break;
                    
                default:
                    System.out.println("Invalid operation! Please try again.");
            }
        }
        
        sc.close();
    }
}

```
