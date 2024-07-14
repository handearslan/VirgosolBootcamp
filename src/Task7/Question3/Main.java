package Task7.Question3;

public class Main {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount();
        savings.deposit(99);
        savings.withdraw(34);
        System.out.println("Savings Account Balance: " + savings.getBalance());

        BankAccount checking = new CheckingAccount();
        checking.deposit(142);
        checking.withdraw(44);
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}