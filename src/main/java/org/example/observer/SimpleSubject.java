package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject{

    private List<Observer> observers;
    private int value = 0;

    public SimpleSubject(){ observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer: observers) observer.update(value);
    }

    public void setValue(int value){ this.value = value; notifyObservers();}
}
