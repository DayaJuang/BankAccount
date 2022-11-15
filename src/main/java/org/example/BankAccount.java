package org.example;

public class BankAccount {
    private double balance;
    private int accountNumber;
    private int phoneNumber;
    private String name;
    private String email;

    public BankAccount(){
        this(123,"Default","Default",123456,0.0);
        System.out.println("Empty Constructor called");
    }

    public BankAccount(int accountNumber, String name, String email, int phoneNumber, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;

        System.out.println("Constructor with parameter is called");

    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Your balance is now " + getBalance());
    }

    public void withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Exceed amount of balance");
            return;
        }

        this.balance -= amount;

        System.out.println("You withdraw " + amount + " from your account, your balance is now " + getBalance());
    }
}
