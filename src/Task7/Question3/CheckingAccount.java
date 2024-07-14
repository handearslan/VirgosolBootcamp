package Task7.Question3;

public class CheckingAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Checking Account: Deposited " + amount);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Checking Account: Withdrew " + amount);
        } else {
            System.out.println("Checking Account: Insufficient funds.");
        }
    }
}