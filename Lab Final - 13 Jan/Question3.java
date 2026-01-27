import java.util.Scanner;

public class CGPACalculator {


    static double getGradePoint(int marks) {
        if (marks >= 80) return 4.00;
        else if (marks >= 75) return 3.75;
        else if (marks >= 70) return 3.50;
        else if (marks >= 65) return 3.25;
        else if (marks >= 60) return 3.00;
        else if (marks >= 55) return 2.75;
        else if (marks >= 50) return 2.50;
        else if (marks >= 45) return 2.25;
        else if (marks >= 40) return 2.00;
        else return 0.00;
    }


    static String getFinalGrade(double cgpa) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student ID: ");
        String studentId = sc.nextLine();

        System.out.print("No. of Courses: ");
        int n = sc.nextInt();

        int totalCreditTaken = 0;
        int totalCreditEarned = 0;
        double weightedPointSum = 0.0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nCourse " + i + ":");

            System.out.print("Credit (Max 3): ");
            int credit = sc.nextInt();

            System.out.print("CT (Max 30): ");
            int ct = sc.nextInt();

            System.out.print("AT (Max 10): ");
            int at = sc.nextInt();

            System.out.print("FE (Max 60): ");
            int fe = sc.nextInt();

            int totalMarks = ct + at + fe;
            double gradePoint = getGradePoint(totalMarks);

            totalCreditTaken += credit;

            if (gradePoint > 0) {
                totalCreditEarned += credit;
            }

            weightedPointSum += gradePoint * credit;
        }

        double cgpa = weightedPointSum / totalCreditTaken;
        cgpa = Math.round(cgpa * 100.0) / 100.0;

        String finalGrade = getFinalGrade(cgpa);

        System.out.println("\n----- Result -----");
        System.out.println("Student ID: " + studentId);
        System.out.println("Credit Taken: " + totalCreditTaken);
        System.out.println("Credit Earned: " + totalCreditEarned);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + finalGrade);

        sc.close();
    }
}
