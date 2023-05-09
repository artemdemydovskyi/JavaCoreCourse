package interfaces.bank;

import interfaces.bank.BankAccount;

/**
 * A class representing a checking bank account.
 */
public class CheckingAccount implements BankAccount {
    private double balance;

    /**
     * Constructs a new CheckingAccount object with a balance of 0.
     */
    public CheckingAccount() {
        balance = 0;
    }

    /**
     * Deposits the specified amount into the account.
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws the specified amount from the account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Gets the current balance of the account.
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Transfers the specified amount from this account to the specified destination account.
     * @param destinationAccount the account to transfer the funds to
     * @param amount the amount to transfer
     */
    public void transfer(BankAccount destinationAccount, double amount) {
        withdraw(amount);
        destinationAccount.deposit(amount);
    }
}
