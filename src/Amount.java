/**
 * The Amount class represents a single transaction, either a deposit or a withdrawal.
 */
public class Amount {
    private double amount; // The amount of money for the transaction
    private TransactionType transactionType; // Type of transaction (DEPOSIT or WITHDRAWAL)

    /**
     * This constructor sets the amount and the type of transaction.
     *
     * @param amount The amount of money in the transaction.
     * @param transactionType The type of transaction (DEPOSIT or WITHDRAWAL).
     */
    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount; // Set the amount
        this.transactionType = transactionType; // Set the transaction type
    }

    /**
     * This method returns the amount of the transaction.
     *
     * @return The transaction amount.
     */
    public double getAmount() {
        return amount; // Return the amount
    }

    /**
     * This method returns the type of transaction (DEPOSIT or WITHDRAWAL).
     *
     * @return The transaction type.
     */
    public TransactionType getTransactionType() {
        return transactionType; // Return the transaction type
    }
}