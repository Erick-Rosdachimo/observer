package com.ifsp.edu.br;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    private final String name;
    private final List<Subscriber> subscribers = new ArrayList<>();

    public YoutubeChannel(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        System.out.println("\n📺 Novo vídeo publicado: \"" + videoTitle + "\"");

        for (Subscriber s : subscribers) {
            s.notify(videoTitle);
        }
    }

    public void uploadVideo(String title) {
        notifySubscribers(title);
    }

    public String getName() {
        return name;
    }
}
