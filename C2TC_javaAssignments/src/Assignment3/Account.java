package Assignment3;

public abstract class Account {

	    String accountNumber;
	    double balance;

	    public Account(String accNo, double bal) {
	        accountNumber = accNo;
	        balance = bal;
	    }

	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();
	

}
