interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class Printer implements Printable {
    String model;
    
    Printer(String model) {
        this.model = model;
    }
    
    public void print() {
        System.out.println(model + " is printing document...");
    }
}

class AllInOne implements Printable, Scannable, Faxable {
    String brand;
    
    AllInOne(String brand) {
        this.brand = brand;
    }
    
    public void print() {
        System.out.println(brand + " - Printing document...");
    }
    
    public void scan() {
        System.out.println(brand + " - Scanning document...");
    }
    
    public void fax() {
        System.out.println(brand + " - Sending fax...");
    }
    
    void performAllTasks() {
        System.out.println("\n" + brand + " performing all tasks:");
        print();
        scan();
        fax();
    }
}

public class Main {
    public static void main(String[] args) {
        Printer simplePrinter = new Printer("HP LaserJet");
        AllInOne multiFunction = new AllInOne("Canon ImageClass");
        
        System.out.println("Simple Printer:");
        simplePrinter.print();
        
        System.out.println("\nAll-In-One Device:");
        multiFunction.performAllTasks();
        
        System.out.println("\nUsing interface references:");
        Printable p = multiFunction;
        Scannable s = multiFunction;
        Faxable f = multiFunction;
        
        p.print();
        s.scan();
        f.fax();
    }
}
