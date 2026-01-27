import java.util.Scanner;

class Account {
    private String accountNumber;
    private String holderName;
    private double balance;
    private int pin;
    
    Account(String accountNumber, String holderName, double initialBalance, int pin) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.pin = pin;
    }
    
    boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }
    
    void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
            System.out.println("Remaining balance: $" + balance);
        } else if(amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    
    void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Current Balance: $" + balance);
    }
    
    void transfer(Account recipient, double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Successfully transferred $" + amount + " to " + recipient.holderName);
            System.out.println("Remaining balance: $" + balance);
        } else if(amount > balance) {
            System.out.println("Insufficient funds for transfer!");
        } else {
            System.out.println("Invalid transfer amount");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Account myAccount = new Account("ACC001", "John Doe", 5000.0, 1234);
        Account otherAccount = new Account("ACC002", "Jane Smith", 3000.0, 5678);
        
        System.out.println("Welcome to ATM System");
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        
        if(!myAccount.verifyPin(enteredPin)) {
            System.out.println("Invalid PIN! Access denied.");
            return;
        }
        
        System.out.println("PIN verified successfully!\n");
        
        while(true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    myAccount.checkBalance();
                    break;
                    
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = sc.nextDouble();
		    myAccount.deposit(depositAmount);
                    break;
                    
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = sc.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                    
                case 4:
                    System.out.print("Enter transfer amount: $");
                    double transferAmount = sc.nextDouble();
                    myAccount.transfer(otherAccount, transferAmount);
                    break;
                    
                case 5:
                    System.out.println("Thank you for using our ATM!");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
