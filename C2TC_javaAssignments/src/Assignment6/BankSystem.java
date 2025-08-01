package Assignment6;

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1001, 5000.0);

        try {
            account.displayBalance();

            // Valid deposit
            account.deposit(1500);

            // Invalid deposit
            account.deposit(-100);

        } catch (InvalidAmountException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        }

        try {
            // Valid withdrawal
            account.withdraw(2000);

            // Withdrawal more than balance
            account.withdraw(6000);

        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        } finally {
            account.displayBalance();
        }
    }
}
