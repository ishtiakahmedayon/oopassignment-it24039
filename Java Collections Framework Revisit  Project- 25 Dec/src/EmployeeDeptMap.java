import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListComparison {
    
    public static <T> boolean areEqualUsingEquals(LinkedList<T> list1, LinkedList<T> list2) {
        if (list1 == null && list2 == null) {
            return true;
        }
        if (list1 == null || list2 == null) {
            return false;
        }
        return list1.equals(list2);
    }
    
    public static <T> boolean areEqualUsingIterator(LinkedList<T> list1, LinkedList<T> list2) {
        if (list1 == null && list2 == null) {
            return true;
        }
        if (list1 == null || list2 == null) {
            return false;
        }
        
        if (list1.size() != list2.size()) {
            return false;
        }
        
        Iterator<T> iter1 = list1.iterator();
        Iterator<T> iter2 = list2.iterator();
        
        while (iter1.hasNext() && iter2.hasNext()) {
            T element1 = iter1.next();
            T element2 = iter2.next();
            
            if (element1 == null) {
                if (element2 != null) {
                    return false;
                }
            } else if (!element1.equals(element2)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static <T> boolean areEqualUsingIndex(LinkedList<T> list1, LinkedList<T> list2) {
        if (list1 == null && list2 == null) {
            return true;
        }
        if (list1 == null || list2 == null) {
            return false;
        }
        
        if (list1.size() != list2.size()) {
            return false;
        }
        
        for (int i = 0; i < list1.size(); i++) {
            T element1 = list1.get(i);
            T element2 = list2.get(i);
            
            if (element1 == null) {
                if (element2 != null) {
                    return false;
                }
            } else if (!element1.equals(element2)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static <T> void displayComparisonResult(LinkedList<T> list1, LinkedList<T> list2, 
                                                   String testName) {
        System.out.println("\n--- " + testName + " ---");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        
        boolean equalMethod1 = areEqualUsingEquals(list1, list2);
        boolean equalMethod2 = areEqualUsingIterator(list1, list2);
        boolean equalMethod3 = areEqualUsingIndex(list1, list2);
        
        System.out.println("\nResults:");
        System.out.println("  Using equals() method: " + equalMethod1);
        System.out.println("  Using iterator method: " + equalMethod2);
        System.out.println("  Using index method: " + equalMethod3);
        System.out.println("  Final verdict: " + (equalMethod1 ? "EQUAL" : "NOT EQUAL"));
    }
    
    public static void main(String[] args) {
        System.out.println("=== LinkedList Comparison Program ===\n");
        
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        
        displayComparisonResult(list1, list2, "Test Case 1: Equal Integer Lists");
        
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(1);
        list3.add(2);
        list3.add(99);
        list3.add(4);
        list3.add(5);
        
        displayComparisonResult(list1, list3, "Test Case 2: Different Elements");
        
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        
        displayComparisonResult(list1, list4, "Test Case 3: Different Sizes");
        
        LinkedList<String> list5 = new LinkedList<>();
        list5.add("Apple");
        list5.add("Banana");
        list5.add("Cherry");
        
        LinkedList<String> list6 = new LinkedList<>();
        list6.add("Apple");
        list6.add("Banana");
        list6.add("Cherry");
        
        displayComparisonResult(list5, list6, "Test Case 4: Equal String Lists");
        
        LinkedList<Integer> list7 = new LinkedList<>();
        LinkedList<Integer> list8 = new LinkedList<>();
        
        displayComparisonResult(list7, list8, "Test Case 5: Empty Lists");
        
        LinkedList<Integer> list9 = new LinkedList<>();
        list9.add(1);
        
        displayComparisonResult(list7, list9, "Test Case 6: Empty vs Non-Empty");
    }
}
