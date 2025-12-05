import java.util.Scanner;

public class MainClass {
    
    public static void main(String[] args) {
        double radius;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = sc.nextDouble();
        
        Circle obj = new Circle();
        obj.setRadius(radius);
        
        System.out.println("The area of the circle with radius " + obj.getRadius() + " is: " + obj.computeArea());
        
        sc.close();
    }
}
