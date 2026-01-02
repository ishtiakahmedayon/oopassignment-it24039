abstract class Employee {
    String name;
    double baseSalary;
    
    abstract double calculateSalary();
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}

class FullTime extends Employee {
    double calculateSalary() {
        return baseSalary;
    }
}

class PartTime extends Employee {
    int hoursWorked;
    
    double calculateSalary() {
        return hoursWorked * baseSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        FullTime ft = new FullTime();
        ft.name = "Soptodip";
        ft.baseSalary = 5000;
        ft.displayInfo();
        
        PartTime pt = new PartTime();
        pt.name = "Shreya";
        pt.baseSalary = 20;
        pt.hoursWorked = 80;
        pt.displayInfo();
    }
}
