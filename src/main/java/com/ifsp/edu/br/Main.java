package com.ifsp.edu.br;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel canal = new YoutubeChannel();

        NoNotificationSubscriber ana = new NoNotificationSubscriber("Ana");

        CustomSubscriber bob = new CustomSubscriber("Bob", List.of("live", "ao vivo"));
        canal.subscribe(bob);

        AllNotificationsSubscriber carol = new AllNotificationsSubscriber("Carol");
        canal.subscribe(carol);

        canal.uploadVideo("Tutorial de Java");
        canal.uploadVideo("Live ao vivo de programação");

        ana.checkManually(canal);

        canal.unsubscribe(bob);
        canal.uploadVideo("Tutorial de como acabar com a base de dados em 5 minutos - ao vivo");
    }
}