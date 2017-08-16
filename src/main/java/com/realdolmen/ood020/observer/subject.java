package com.realdolmen.ood020.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 16/08/2017.
 */
public abstract class subject {

    List<Observer> observers = new ArrayList<>();

    public void addObserver (Observer observer){
        observers.add(observer);
    }

    public void removeObserver (Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }



}
