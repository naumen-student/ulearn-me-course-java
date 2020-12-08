package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message<T>> {
    private final HashMap<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, Collections.emptyList());
        }
    };

    @Override
    public void accept(Message<T> tMessage) {
        if (!mailBox.containsKey(tMessage.getTo()))
            mailBox.put(tMessage.getTo(), new LinkedList<>());
        mailBox.get(tMessage.getTo()).add(tMessage.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

}