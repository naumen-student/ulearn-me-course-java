package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Post<T>> {
    private final Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new HashMap<>();
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Post<T> tMessage) {

        if (!mailBox.containsKey(tMessage.getTo())) {
            mailBox.put(tMessage.getTo(), new ArrayList<>());
        }

        mailBox.get(tMessage.getTo()).add(tMessage.getContent());
    }
}
