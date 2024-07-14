package Task7.Question3;

// SavingsAccount.java (Child class)
public class SavingsAccount extends BankAccount {

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Account: Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings Account: Withdrew " + amount);
        } else {
            System.out.println("Savings Account: Insufficient funds.");
        }
    }
}