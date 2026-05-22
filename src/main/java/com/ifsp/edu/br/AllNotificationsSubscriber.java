package com.ifsp.edu.br;

public class AllNotificationsSubscriber implements Subscriber {
    private final String name;

    public AllNotificationsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void notify(String videoTitle) {
        System.out.println("🔔🔔 " + name + " recebeu notificação (todas): \"" + videoTitle + "\"");
    }
}
