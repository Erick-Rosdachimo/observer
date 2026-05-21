package com.ifsp.edu.br;

public class ObserverImpl implements Observer {
    private final String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println(name + " received update: " + state);
    }
}
