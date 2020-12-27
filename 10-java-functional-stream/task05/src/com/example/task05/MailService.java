package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message<T>> {

    private final Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, Collections.emptyList());
        }
    };

    @Override
    public void accept(Message<T> tMessage) {
        if (!mailBox.containsKey(tMessage.getTo())) {
            ArrayList<T> tList = new ArrayList<>();
            tList.add(tMessage.getContent());
            mailBox.put(tMessage.getTo(), tList);
        } else {
            mailBox.get(tMessage.getTo()).add(tMessage.getContent());
        }
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

}