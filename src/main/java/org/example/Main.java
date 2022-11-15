package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount bobAccount = new BankAccount();

        System.out.println(bobAccount.getName());
        bobAccount.deposit(100);
        bobAccount.withdraw(25);
    }
}