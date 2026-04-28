package OOPS_6;

public class AbstractionDemo {
     public static void main(String[] args) {
        // BankAccount account = new BankAccount(); // We cannot create object of abstract class
        
        BankAccount acc1 = new SavingsAccount();
        acc1.deposit(1000);
        acc1.withdraw(1200);

        BankAccount acc2 = new CurrentAccount();
        acc2.deposit(1000);
        acc2.withdraw(1200);

     }  
}
