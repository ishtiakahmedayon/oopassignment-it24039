import java.util.Scanner;

public class SmallestPositiveRoot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quadratic Equation Form:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println();

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            sc.close();
            return;
        }

        double D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("No real roots exist.");
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            double smallestPositive = Double.MAX_VALUE;

            if (x1 > 0 && x1 < smallestPositive)
                smallestPositive = x1;

            if (x2 > 0 && x2 < smallestPositive)
                smallestPositive = x2;

            if (smallestPositive == Double.MAX_VALUE) {
                System.out.println("No positive root exists.");
            } else {
                System.out.println("Smallest positive root = " + smallestPositive);
            }
        }

        sc.close();
    }
}
