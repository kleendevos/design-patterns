package com.realdolmen.ood020.State;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class BankruptState extends State {
    @Override
    public State debit(BankAccount account, double amount) {
        account.setBalance(account.getBalance()+amount);
        if (account.getBalance()<-1000) {
            return this;
        } else if (account.getBalance()>-1000 && account.getBalance()<0){
            return new InCreditState();
        } else if (account.getBalance()>0);{
            return new PositiveState();
        }
    }

    @Override
    public State credit(BankAccount account, double amount) {
        return this;
    }

    @Override
    public State close(BankAccount account) {
        return this;
    }
}
