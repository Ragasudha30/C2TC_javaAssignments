package Assignment3;

public class Transaction {
	
	    final double transactionFee = 2.0;

	    public final void performTransaction(Account acc, String type, double amount) {
	        System.out.println("Transaction Type: " + type);
	        System.out.println("Transaction Fee: " + transactionFee);

	        if (type.equalsIgnoreCase("deposit")) {
	            acc.deposit(amount);
	        } else if (type.equalsIgnoreCase("withdraw")) {
	            acc.withdraw(amount + transactionFee);
	        } else {
	            System.out.println("Invalid transaction type.");
	        }

	        System.out.println("Balance after transaction: " + acc.getBalance());
	    }

}
