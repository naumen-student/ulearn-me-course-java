package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message<T>> {
    HashMap<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, Collections.emptyList());
        }
    };

    public HashMap<String, List<T>> getMailBox() {
        return mailBox;
    }

    public void accept(Message<T> tMessage) {
        if (mailBox.containsKey(tMessage.getTo())) {
            mailBox.get(tMessage.getTo()).add(tMessage.getContent());
        } else {
            ArrayList<T> list = new ArrayList<>();
            list.add(tMessage.getContent());
            mailBox.put(tMessage.getTo(), list);
        }
    }

    public Consumer<Message<T>> andThen(Consumer<? super Message<T>> after) {
        Objects.requireNonNull(after);
        return (Message<T> t) -> {
            accept(t);
            after.accept(t);
        };
    }
}
