/**
 * This is the main class to test the PersonalAccount.
 * It shows how to deposit, withdraw, and print the transaction history.
 */
public class Main {
    public static void main(String[] args) {
        // Create a new personal account for the owner
        PersonalAccount account = new PersonalAccount(12345, "Latifa");

        // Deposit and withdraw money
        account.deposit(2000);  // Deposit 2000
        account.withdraw(500);  // Withdraw 500
        account.deposit(300);   // Deposit 300

        // Show the current balance
        System.out.println("Current Balance: " + account.getBalance());

        // Print the transaction history
        account.printTransactionHistory();
    }
}