package Assignment3;

public class CheckingAccount extends Account{

	    public CheckingAccount(String accNo, double bal) {
	        super(accNo, bal);
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance + 500) {
	            balance -= amount;
	        } else {
	            System.out.println("Overdraft limit exceeded in Checking Account.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

}
