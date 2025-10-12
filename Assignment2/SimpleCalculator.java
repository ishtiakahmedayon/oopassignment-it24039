import java.util.Scanner;

public class SimpleCalculator {

    public static int AddTwoNum(int a, int b) {
        return a + b;
    }
    public static int SubTwoNum(int a, int b) {
        if (a < b)
            return b - a; 
        else
            return a - b;
    }
    public static int MulTwoNum(int a, int b) {
        return a * b;
    }
    public static int DivTwoNum(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Press 1 To Add Two Numbers");
        System.out.println("Press 2 To Subtract Two Numbers");
        System.out.println("Press 3 To Multiply Two Numbers");
        System.out.println("Press 4 To Divide Two Numbers");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice = ");
        int choice = sc.nextInt();

        System.out.print("Enter a = ");
        int a = sc.nextInt();
      
        System.out.print("Enter b = ");
        int b = sc.nextInt();

        if (choice == 1) {
            System.out.print(a + " + " + b + " = " + AddTwoNum(a, b));
        } 
       else if (choice == 2) {
            if (a >= b) {
                System.out.println(a + " - " + b + " = " + SubTwoNum(a, b));
            } else {
                System.out.println(b + " - " + a + " = " + SubTwoNum(a, b));
            }
        } 
        else if (choice == 3) {
            System.out.print(a + " * " + b + " = " + MulTwoNum(a, b));
        } 
        else if (choice == 4) {
            if (b != 0)
                System.out.print(a + " / " + b + " = " + DivTwoNum(a, b));
            else
                System.out.print("Error: Division by zero");
        } 
        else {
            System.out.print("Invalid Option !!");
        }
    }
}
