package com.realdolmen.ood020.State;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class InCreditState extends State {
    @Override
    public State debit(BankAccount account, double amount) {
        account.setBalance(account.getBalance()+amount);
        if (account.getBalance()>0) {
            return new PositiveState();
        } return this;
    }

    @Override
    public State credit(BankAccount account, double amount) {
        account.setBalance(account.getBalance()-amount);
        if (account.getBalance()<-1000){
            return new BankruptState();
        }
        return this;
        }



    @Override
    public State close(BankAccount account) {
        account.setBalance(0.0);
        return new ClosedState();
    }
}
