package com.ifsp.edu.br;

public class Main {
    public static void main(String[] args) {

        SubjectImpl subject = new SubjectImpl();

        ObserverImpl observer1 = new ObserverImpl("Observer 1");
        ObserverImpl observer2 = new ObserverImpl("Observer 2");
        ObserverImpl observer3 = new ObserverImpl("Observer 3");

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        subject.setState("New State");

        subject.remove(observer1);

        subject.setState("New State");
    }
}