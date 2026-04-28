// Abstraction = Hiding implementation details + showing only essential features

// Abstraction is achieved using abstract class and interfaces

// BankAccount(no object) as abstract - because its template not a final usable account 👉 You always open:
//                                                                              Savings Account 🏦
//                                                                              Current Account 🏦

package OOPS_6;

abstract public class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Every bank account must have deposit and withdraw methods
    // just defined here void - no return type - NO implementation
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
}

