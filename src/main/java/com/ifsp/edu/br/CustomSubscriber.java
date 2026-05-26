package com.ifsp.edu.br;

import java.util.List;

public class CustomSubscriber implements Subscriber {
    private final String name;
    private final List<String> preferredTypes;

    public CustomSubscriber(String name, List<String> preferredTypes) {
        this.name = name;
        this.preferredTypes = preferredTypes;
    }

    @Override
    public void notify(String videoTitle) {
        boolean isRelevant = preferredTypes.stream()
                .anyMatch(type -> videoTitle.toLowerCase().contains(type));

        if (isRelevant) {
            System.out.println("🔔 " + name + " recebeu notificação personalizada: \"" + videoTitle + "\"");
        }
    }

    public void checkManually(YoutubeChannel channel) {
        System.out.println(name + " verificou o canal "+channel.getName()+" manualmente.");
    }
}
