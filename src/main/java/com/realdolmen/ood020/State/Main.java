package com.realdolmen.ood020.State;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.debit(1000);

        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());

        bankAccount.credit(500);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());

        bankAccount.credit(800);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());


        bankAccount.credit(1000);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());

        bankAccount.credit(500);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());

        bankAccount.debit(400);
        System.out.println(bankAccount.getState() + " " + bankAccount.getBalance());

    }
}
