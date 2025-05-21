package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            observer.onNotify(message);
        }
    }
}
