package Task7.Question3;

public abstract class BankAccount {
    protected double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}