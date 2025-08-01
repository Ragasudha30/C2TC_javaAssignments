package Assignment6;

public class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit a valid amount
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    // Method to withdraw amount ensuring sufficient funds
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }

    // Display current balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Current Balance: ₹" + balance);
    }
}
