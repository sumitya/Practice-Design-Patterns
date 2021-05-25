package org.example.observer;

public class Driver {
    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();

        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        simpleSubject.setValue(12);

        //simpleSubject.notifyObservers();

        simpleSubject.removeObserver(simpleObserver);
    }
}
