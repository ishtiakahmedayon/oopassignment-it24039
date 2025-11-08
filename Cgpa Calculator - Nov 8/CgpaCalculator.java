import java.util.Scanner;

public class CgpaCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentId;
        int numCourses;
        double totalCredit = 0;
        double totalWeightedGPA = 0;

        System.out.print("Student ID: ");
        studentId = sc.nextLine();

        System.out.print("No. of Courses: ");
        numCourses = sc.nextInt();

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nCourse " + i + ":");
            System.out.print("Credit (Max 3): ");
            double credit = sc.nextDouble();
            System.out.print("Class tests (Max 30): ");
            double ct = sc.nextDouble();
            System.out.print("Attandance (Max 10): ");
            double at = sc.nextDouble();
            System.out.print("Final Exam (Max 60): ");
            double fe = sc.nextDouble();

            double totalMarks = ct + at + fe;
            double gpa = calculateGPA(totalMarks);
            totalWeightedGPA += gpa * credit;
            totalCredit += credit;
        }

        double cgpa = totalWeightedGPA / totalCredit;
        String grade = getGrade(cgpa);

        System.out.println("\n--- Result Summary ---");
        System.out.println("Student ID: " + studentId);
        System.out.println("Credit Taken: " + (int) totalCredit);
        System.out.println("Credit Earned: " + (int) totalCredit);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);
    }

    static double calculateGPA(double marks) {
        if (marks >= 80) return 4.0;
        else if (marks >= 75) return 3.75;
        else if (marks >= 70) return 3.5;
        else if (marks >= 65) return 3.25;
        else if (marks >= 60) return 3.0;
        else if (marks >= 55) return 2.75;
        else if (marks >= 50) return 2.5;
        else if (marks >= 45) return 2.25;
        else if (marks >= 40) return 2.0;
        else return 0.0;
    }

    static String getGrade(double cgpa) {
        if (cgpa >= 4.00) return "A+";
        else if (cgpa >= 3.75) return "A";
        else if (cgpa >= 3.50) return "A-";
        else if (cgpa >= 3.25) return "B+";
        else if (cgpa >= 3.00) return "B";
        else if (cgpa >= 2.75) return "B-";
        else if (cgpa >= 2.50) return "C+";
        else if (cgpa >= 2.25) return "C";
        else if (cgpa >= 2.00) return "D";
        else return "F";
    }
}
