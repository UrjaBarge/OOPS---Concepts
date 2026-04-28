package OOPS_6;

class CurrentAccount extends BankAccount {

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current: Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;  // allow overdraft
        System.out.println("Current: Withdrawn " + amount);
    }
}