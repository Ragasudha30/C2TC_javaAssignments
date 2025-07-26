package Assignment3;

public class SavingsAccount extends Account {

	    public SavingsAccount(String accNo, double bal) {
	        super(accNo, bal);
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Not enough balance in Savings Account.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

}
