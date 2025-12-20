
import model.Student;
import exceptions.InvalidAgeException;
import exceptions.InvalidDepartmentException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter department (CSE/ICT/MECH): ");
        String dept = scanner.nextLine();

        try {
            Student student = new Student(name, age, dept);
            System.out.println("\nStudent created successfully!");
            System.out.println(student);
        } catch (InvalidAgeException e) {
            System.out.println("\nError: " + e.getMessage());
        } catch (InvalidDepartmentException e) {
            System.out.println("\nError: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
