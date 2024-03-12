package entities;

public class Account {
    private String name;
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }
    public Account(String name, int accountNumber, double initialDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= value + 5.0;
    }



    public String toString() {
        return "Account "
        + accountNumber
        + ", Holder: "
        + name
        + ", Balance: $"
        + String.format("%.2f", balance);
    }
    
}
