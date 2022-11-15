package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount bobAccount = new BankAccount();
        BankAccount timAccount = new BankAccount("Tim","Tim@yahoo.com",12345);

        System.out.println(timAccount.getBalance());
        bobAccount.deposit(100);
        bobAccount.withdraw(25);

        VipCustomer larry = new VipCustomer("Larry","Larry@gmail.com");

        System.out.println(larry.getCreditLimit());
    }
}