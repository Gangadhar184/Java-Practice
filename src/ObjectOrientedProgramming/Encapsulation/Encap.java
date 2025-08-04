package ObjectOrientedProgramming.Encapsulation;

/**
 *
 * Encapsulation : Bundling data and the methods that operate on that data together,
 *                  While controlling access to the internal state of an object.

    Data Hiding: The internal implementation details of a class are hidden from external classes. Other objects cant
                    directly access or modify the internal state.

    Controlled Access: Access to the object's data is provided through well-defined interfaces(public methods),
                        allowing the class to control how its data is accessed and modified

    Bundling: Related data and behaviour are grouped together in single unit(class)
 */


public class Encap {

    // private fields - data hiding
    private final String accountNumber;
    private double balance;
    private final String customerName;

    public Encap(String accountNumber, String customerName, double initialBalance){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = initialBalance >= 0 ?initialBalance : 0;
    }

    // controlled access (public methods)
    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getCustomerName() {
        return customerName;
    }

    // controlled modification
    public boolean deposit(double amount){
        if(amount > 0 ){
            balance += amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount){
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // Create an account using constructor
        Encap account = new Encap("123456789", "Gangadhar", 5000.0);

        // Accessing data using getters (controlled access)
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Depositing money (controlled modification)
        boolean depositSuccess = account.deposit(2000.0);
        System.out.println("Deposit 2000: " + (depositSuccess ? "Successful" : "Failed"));
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdrawing money (controlled modification)
        boolean withdrawSuccess = account.withdraw(3000.0);
        System.out.println("Withdraw 3000: " + (withdrawSuccess ? "Successful" : "Failed"));
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempting to withdraw more than the balance
        boolean overdrawAttempt = account.withdraw(10000.0);
        System.out.println("Attempt to overdraw ₹10000: " + (overdrawAttempt ? "Successful" : "Failed"));
        System.out.println("Final Balance: " + account.getBalance());
    }

}
