package com.ifsp.edu.br;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String state;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
