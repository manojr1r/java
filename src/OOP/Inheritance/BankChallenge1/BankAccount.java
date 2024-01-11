package OOP.Inheritance.BankChallenge1;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        System.out.println("Account Balance ₹ "+ balance);
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Your acoount balace is \u20B9 " + balance);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount){
    balance += amount;
        System.out.println("Your current account balance is \u20B9 " + balance);
    }
    public void withdraw( double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("Your account balance after withdrawal is \u20B9 " + balance);
        }
        else System.out.println("You don't have sufficient balance to withdraw.");
    }
}
