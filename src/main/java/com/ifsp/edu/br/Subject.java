package com.ifsp.edu.br;

public interface Subject {
    void register(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
