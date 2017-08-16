package com.realdolmen.ood020.State;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public class BankAccount {

    private double balance = 0.0;
    private State state = new PositiveState();

    public BankAccount() {
    }

    public BankAccount(double balance, State state) {
        this.balance = balance;
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }



    public void debit (double amount){
        state = state.debit(this, amount);

    }

    public void credit (double amount){
        state = state.credit(this,amount);

    }

    public void close (){
        state = state.close(this);

    }


}
