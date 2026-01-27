# Area of Circle

### Code:
Circle.java
```
public class Circle {
    private double radius;
    
    public Circle() {}
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void setRadius(double rad) {
        this.radius = rad;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public double computeArea() {
        return (radius * radius * Math.PI);
    }
}
```

Mainclass.java
```
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
```
