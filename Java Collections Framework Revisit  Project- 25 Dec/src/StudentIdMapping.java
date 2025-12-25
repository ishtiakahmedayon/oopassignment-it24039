import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class StudentIdMapping {
    
    static class Student {
        private String name;
        private String major;
        private double gpa;
        private int year;
        
        public Student(String name, String major, double gpa, int year) {
            this.name = name;
            this.major = major;
            this.gpa = gpa;
            this.year = year;
        }
        
        public String getName() { return name; }
        public String getMajor() { return major; }
        public double getGpa() { return gpa; }
        public int getYear() { return year; }
        
        public void setName(String name) { this.name = name; }
        public void setMajor(String major) { this.major = major; }
        public void setGpa(double gpa) { this.gpa = gpa; }
        public void setYear(int year) { this.year = year; }
        
        @Override
        public String toString() {
            return String.format("Name: %-20s | Major: %-20s | GPA: %.2f | Year: %d",
                               name, major, gpa, year);
        }
        
        public String getDetailedInfo() {
            StringBuilder sb = new StringBuilder();
            sb.append("\n  Name: ").append(name);
            sb.append("\n  Major: ").append(major);
            sb.append("\n  GPA: ").append(String.format("%.2f", gpa));
            sb.append("\n  Year: ").append(year);
            return sb.toString();
        }
    }
    
    public static void addSampleStudents(TreeMap<Integer, Student> studentMap) {
        studentMap.put(1001, new Student("Alice Johnson", "Computer Science", 3.8, 3));
        studentMap.put(1005, new Student("Bob Smith", "Electrical Engineering", 3.6, 2));
        studentMap.put(1003, new Student("Charlie Brown", "Mathematics", 3.9, 4));
        studentMap.put(1002, new Student("Diana Prince", "Physics", 3.7, 3));
        studentMap.put(1004, new Student("Eve Wilson", "Chemistry", 3.5, 1));
    }
    
    public static void displayAllStudents(TreeMap<Integer, Student> studentMap) {
        System.out.println("\n=== Student Records (Sorted by ID) ===");
        System.out.println("Total Students: " + studentMap.size());
        System.out.println("\n" + "=".repeat(80));
        
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | " + entry.getValue());
        }
        System.out.println("=".repeat(80));
    }
    
    public static void searchStudent(TreeMap<Integer, Student> studentMap, int studentId) {
        if (studentMap.containsKey(studentId)) {
            Student student = studentMap.get(studentId);
            System.out.println("\n--- Student Found ---");
            System.out.println("ID: " + studentId);
            System.out.println(student.getDetailedInfo());
        } else {
            System.out.println("\nStudent with ID " + studentId + " not found.");
        }
    }
    
    public static void displayStudentsInRange(TreeMap<Integer, Student> studentMap, 
                                             int startId, int endId) {
        System.out.println("\n--- Students with IDs from " + startId + " to " + endId + " ---");
        
        Map<Integer, Student> subMap = studentMap.subMap(startId, true, endId, true);
        
        if (subMap.isEmpty()) {
            System.out.println("No students found in this range.");
        } else {
            for (Map.Entry<Integer, Student> entry : subMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " | " + entry.getValue());
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Student Management System using TreeMap ===\n");
        
        TreeMap<Integer, Student> studentMap = new TreeMap<>();
        
        addSampleStudents(studentMap);
        displayAllStudents(studentMap);
        
        System.out.println("\n--- Search Operations ---");
        searchStudent(studentMap, 1003);
        searchStudent(studentMap, 9999);
        
        displayStudentsInRange(studentMap, 1002, 1004);
        
        System.out.println("\n--- TreeMap-Specific Operations ---");
        System.out.println("First Student ID: " + studentMap.firstKey());
        System.out.println("Last Student ID: " + studentMap.lastKey());
        System.out.println("Student with ID 1003 or next higher: " + 
                         studentMap.ceilingKey(1003));
        System.out.println("Student with ID 1003 or next lower: " + 
                         studentMap.floorKey(1003));
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Interactive Search ---");
        System.out.print("Enter a student ID to search: ");
        
        try {
            int searchId = scanner.nextInt();
            searchStudent(studentMap, searchId);
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
        
        scanner.close();
    }
}
