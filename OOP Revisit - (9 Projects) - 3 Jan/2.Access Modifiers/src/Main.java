class BankAccount {
    private String owner;
    private double balance;
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }
    
    public String getOwner() {
        return owner;
    }
    
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setOwner("Somiddho");
        acc.deposit(1000);
        
        System.out.println("Owner: " + acc.getOwner());
        System.out.println("Balance: $" + acc.getBalance());
        
        acc.deposit(500);
        System.out.println("New Balance: $" + acc.getBalance());
    }
}
