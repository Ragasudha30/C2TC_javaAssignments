package Assignment3;

public class Main {

	public static void main(String[] args) {
		
		        Bank b1 = new Bank();
		        Bank b2 = new Bank();

		        System.out.println("Total accounts created: " + Bank.getTotalAccounts());

		        Account sa = new SavingsAccount("SA101", 1000);
		        Account ca = new CheckingAccount("CA101", 500);

		        Transaction t = new Transaction();

		        t.performTransaction(sa, "deposit", 200);
		        t.performTransaction(ca, "withdraw", 300);
		    }

}
