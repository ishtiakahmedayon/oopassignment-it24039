package model;

import exceptions.InvalidAgeException;
import exceptions.InvalidDepartmentException;

public class Student {
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) throws InvalidAgeException, InvalidDepartmentException {
        this.name = name;
        setAge(age);
        setDepartment(department);
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 25) {
            throw new InvalidAgeException("Age must be between 18 and 25. Provided: " + age);
        }
        this.age = age;
    }

    public void setDepartment(String department) throws InvalidDepartmentException {
        if (!department.equals("CSE") && !department.equals("ICT") && !department.equals("MECH")) {
            throw new InvalidDepartmentException("Invalid department: " + department + ". Valid departments: CSE, ICT, MECH");
        }
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}
