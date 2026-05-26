package com.ifsp.edu.br;

public class NoNotificationSubscriber implements Subscriber {
    private final String name;

    public NoNotificationSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void notify(String videoTitle) {
    }

    public void checkManually(YoutubeChannel channel) {
        System.out.println(name + " verificou o canal "+channel.getName()+" manualmente.");
    }
}
