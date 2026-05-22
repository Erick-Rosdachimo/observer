package com.ifsp.edu.br;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    private final List<Subscriber> allNotificationsSubscribers = new ArrayList<>();
    private final List<Subscriber> customSubscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
    }

    public void subscribeWithAll(Subscriber subscriber) {
        allNotificationsSubscribers.add(subscriber);
    }

    public void subscribeWithCustom(Subscriber subscriber) {
        customSubscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        allNotificationsSubscribers.remove(subscriber);
        customSubscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        System.out.println("\n📺 Novo vídeo publicado: \"" + videoTitle + "\"");

        for (Subscriber s : allNotificationsSubscribers) {
            s.notify(videoTitle);
        }
        for (Subscriber s : customSubscribers) {
            s.notify(videoTitle);
        }
    }

    public void uploadVideo(String title) {
        notifySubscribers(title);
    }
}
