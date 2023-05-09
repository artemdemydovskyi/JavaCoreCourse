package interfaces.bank;

/**
 * An interface representing a bank account.
 */
public interface BankAccount {


    /**
     * Deposits the specified amount into the account.
     * @param amount the amount to deposit
     */
    void deposit(double amount);

    /**
     * Withdraws the specified amount from the account.
     * @param amount the amount to withdraw
     */
    void withdraw(double amount);

    /**
     * Gets the current balance of the account.
     * @return the current balance
     */
    double getBalance();

    /**
     * Transfers the specified amount from this account to the specified destination account.
     * @param destinationAccount the account to transfer the funds to
     * @param amount the amount to transfer
     */
    void transfer(BankAccount destinationAccount, double amount);
}
