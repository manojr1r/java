package OOPS.OOP.Inheritance.BankChallenge;

public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(5_100);
        System.out.println(  account.getBalance());
         account.deposit(546);
        account.withdraw(1000);
        account.withdraw(10000);
        account.deposit(9_00_000);
        account.setCustomerName("Manoj");
        account.setEmail("manoj@mail.com");
        System.out.println( account.getEmail());
        account.withdraw(904646.0);
    }
}
