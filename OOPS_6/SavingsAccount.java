package OOPS_6;

public class SavingsAccount extends BankAccount {
    //Since Bankaccount is abstract, we need to implement methods here in savings account
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings: Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings: Withdrawn " + amount);
        } else {
            System.out.println("Savings: Insufficient balance");
        }
    }
}
