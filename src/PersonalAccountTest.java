/**
 * This class tests the PersonalAccount class.
 * It checks if the deposit, withdrawal, and transaction history methods work correctly.
 */
public class PersonalAccountTest {
    public static void main(String[] args) {
        // Create a new personal account
        PersonalAccount account = new PersonalAccount(12345, "Latifa");

        // Test 1: Deposit money
        System.out.println("----- Test 1: Deposit -----");
        account.deposit(2000);
        // Check if the balance is correct after deposit
        System.out.println("Expected Balance: 2000.0, Actual Balance: " + account.getBalance());

        // Test 2: Withdraw money
        System.out.println("\n----- Test 2: Withdraw -----");
        account.withdraw(500);
        // Check if the balance is correct after withdrawal
        System.out.println("Expected Balance: 1500.0, Actual Balance: " + account.getBalance());

        // Test 3: Withdraw more than balance (should fail)
        System.out.println("\n----- Test 3: Withdraw more than balance -----");
        account.withdraw(2000); // This should show an error message
        // Check the balance remains the same after failed withdrawal
        System.out.println("Expected Balance: 1500.0, Actual Balance: " + account.getBalance());

        // Test 4: Print transaction history
        System.out.println("\n----- Test 4: Transaction History -----");
        account.printTransactionHistory(); // Print the list of transactions

        // Test 5: Check balance directly
        System.out.println("\n----- Test 5: Check Balance -----");
        System.out.println("Current Balance: " + account.getBalance()); // Show current balance
    }
}