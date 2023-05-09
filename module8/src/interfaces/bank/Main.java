package interfaces.bank;

import interfaces.bank.CheckingAccount;

/**
 * A simple main class that demonstrates the use of the CheckingAccount class.
 */
public class Main {

    /**
     * The main method that runs the program.
     */
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount();
        CheckingAccount account2 = new CheckingAccount();

        account1.deposit(1000);
        account1.transfer(account2, 500);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}
