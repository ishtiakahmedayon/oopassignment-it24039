import java.util.Scanner;

public class JavaMathClass {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      // Equation 1: Height of a right triangle
      System.out.println("Equation 1: Calculate the height of a right triangle.");
      System.out.print("Enter base (b): ");
      double b = sc.nextDouble();
      System.out.print("Enter angle (theta in degrees): ");
      double theta = sc.nextDouble();
      double height = b * Math.tan(Math.toRadians(theta));
      System.out.println("Height: "+ height);
      System.out.println();

      // Equation 2: Compound Interest
      System.out.println("Equation 2: Compound Interest Calculation.");
      System.out.print("Enter Principal (P): ");
      double P = sc.nextDouble();
      System.out.print("Enter Annual Interest Rate (r as a decimal): ");
      double r = sc.nextDouble();
      System.out.print("Enter Number of Compounds per Year (n): ");
      double n = sc.nextDouble();
      System.out.print("Enter Time in Years (t): ");
      double t = sc.nextDouble();
      double A = P * Math.pow((1 + r/n), n*t);
      System.out.println("Total Amount: "+A);
      System.out.println();

      // Equation 3: Cartesian to Polar
      System.out.println("Equation 3: Convert Cartesian to Polar Coordinates.");
      System.out.print("Enter x: ");
      double x = sc.nextDouble();
      System.out.print("Enter y: ");
      double y = sc.nextDouble();
      double radius = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
      double angle = Math.toDegrees(Math.atan2(y, x));
      System.out.println("Radius: "+radius+", Angle: "+angle);
      System.out.println();

      // Equation 4: Distance Between Two Points
      System.out.println("Equation 4: Calculate Distance Between Two Points.");
      System.out.print("Enter x1: ");
      double x1 = sc.nextDouble();
      System.out.print("Enter y1: ");
      double y1 = sc.nextDouble();
      System.out.print("Enter x2: ");
      double x2 = sc.nextDouble();
      System.out.print("Enter y2: ");
      double y2 = sc.nextDouble();
      double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
      System.out.println("Distance: "+distance);
      System.out.println();

      // Equation 5: Solve Quadratic Equation
      System.out.println("Equation 5: Solve Quadratic Equation.");
      System.out.print("Enter a: ");
      double a = sc.nextDouble();
      System.out.print("Enter b: ");
      double bb = sc.nextDouble();
      System.out.print("Enter c: ");
      double c = sc.nextDouble();
      double D = Math.pow(bb,2) - 4*a*c;
      if(D >= 0){
         double root1 = (-bb + Math.sqrt(D)) / (2*a);
         double root2 = (-bb - Math.sqrt(D)) / (2*a);
         System.out.println("Roots: "+root1+" and "+root2);
      } else{
         System.out.println("No real roots (complex values).");
      }
      System.out.println();

      // --- Demonstrating Math class methods ---
      System.out.println("== Other Math Class Methods ==");

      // Constants
      System.out.println("PI value: "+Math.PI);
      System.out.println("E value: "+Math.E);

      // Trigonometric
      double rad = Math.toRadians(30);
      System.out.println("sin(30°) = "+Math.sin(rad));
      System.out.println("cos(30°) = "+Math.cos(rad));
      System.out.println("tan(30°) = "+Math.tan(rad));

      // Exponent and Log
      System.out.println("exp(1) = "+Math.exp(1));
      System.out.println("log(2.71) = "+Math.log(2.71));
      System.out.println("pow(3.5, 2.5) = "+Math.pow(3.5,2.5));
      System.out.println("sqrt(10.5) = "+Math.sqrt(10.5));

      // Rounding
      System.out.println("ceil(2.1) = "+Math.ceil(2.1));
      System.out.println("floor(-2.1) = "+Math.floor(-2.1));
      System.out.println("round(2.6f) = "+Math.round(2.6f));

      // min, max, abs, random
      System.out.println("max(2.5, 3.6) = "+Math.max(2.5,3.6));
      System.out.println("min(2.5, 3.6) = "+Math.min(2.5,3.6));
      System.out.println("abs(-2.1) = "+Math.abs(-2.1));
      System.out.println("random() = "+Math.random());

      sc.close();
   }
}
