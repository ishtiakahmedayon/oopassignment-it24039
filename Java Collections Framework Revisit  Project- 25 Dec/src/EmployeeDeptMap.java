import java.util.HashMap;
import java.util.Map;

public class EmployeeDeptMap {
    
    public static void main(String[] args) {
        HashMap<Integer, String> employeeDepartmentMap = new HashMap<>();
        
        employeeDepartmentMap.put(101, "Engineering");
        employeeDepartmentMap.put(102, "Marketing");
        employeeDepartmentMap.put(103, "Engineering");
        employeeDepartmentMap.put(104, "Human Resources");
        employeeDepartmentMap.put(105, "Finance");
        employeeDepartmentMap.put(106, "Engineering");
        employeeDepartmentMap.put(107, "Sales");
        employeeDepartmentMap.put(108, "Marketing");
        
        System.out.println("=== Employee ID to Department Mapping ===\n");
        
        for (Map.Entry<Integer, String> entry : employeeDepartmentMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + " -> Department: " + entry.getValue());
        }
        
        System.out.println("\nTotal Employees: " + employeeDepartmentMap.size());
        
        int searchId = 105;
        if (employeeDepartmentMap.containsKey(searchId)) {
            System.out.println("\nEmployee " + searchId + " works in: " + employeeDepartmentMap.get(searchId));
        }
    }
}
