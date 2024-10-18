/**
 * The PersonalAccount class is for managing a bank account.
 * It lets you deposit and withdraw money and keeps track of transactions.
 */
public class PersonalAccount {
    private int accountNumber;  // Unique number for the account
    private String accountHolder; // Name of the account owner
    private double balance; // Current amount of money in the account
    private Amount[] transactions; // Array to store transactions
    private int transactionCount; // Number of transactions made

    /**
     * This is the constructor. It sets up the account number,
     * the name of the account holder, and starts the balance at 0.0.
     *
     * @param accountNumber The number for this account.
     * @param accountHolder The name of the account owner.
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new Amount[100]; // Max 100 transactions
        this.transactionCount = 0;
    }

    /**
     * This method adds money to the account and records the transaction.
     *
     * @param amount The amount of money to deposit.
     */
    public void deposit(double amount) {
        if (amount > 0) { // Check if the amount is positive
            this.balance += amount; // Add amount to balance
            transactions[transactionCount++] = new Amount(amount, TransactionType.DEPOSIT); // Record transaction
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount."); // Show error message
        }
    }

    /**
     * This method takes money out of the account if there is enough balance.
     *
     * @param amount The amount of money to withdraw.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) { // Check if amount is valid
            this.balance -= amount; // Subtract amount from balance
            transactions[transactionCount++] = new Amount(amount, TransactionType.WITHDRAWAL); // Record transaction
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount."); // Show error message
        }
    }

    /**
     * This method prints the list of all transactions.
     */
    public void printTransactionHistory() {
        for (int i = 0; i < transactionCount; i++) { // Loop through transactions
            System.out.println(transactions[i].getTransactionType() + ": " + transactions[i].getAmount()); // Print each transaction
        }
    }

    /**
     * This method returns the current balance of the account.
     *
     * @return The current account balance.
     */
    public double getBalance() {
        return balance; // Return balance
    }

    /**
     * This method returns the account number.
     *
     * @return The account number.
     */
    public int getAccountNumber() {
        return accountNumber; // Return account number
    }

    /**
     * This method returns the name of the account holder.
     *
     * @return The name of the account holder.
     */
    public String getAccountHolder() {
        return accountHolder; // Return account holder's name
    }
}