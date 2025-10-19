public class RectangleArea2 {

    public static void main(String[] args) {
        final double width = 4.5;
        final double height = 7.9;

        double area = width * height;

        double perimeter = 2 * (width + height);

        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
    }
}