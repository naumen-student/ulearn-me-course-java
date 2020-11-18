package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IMessage<T>> {
    private final Map<String, List<T>> messages = new HashMap<String, List<T>>(){

        @Override
        public List<T> get(Object key) {
            if (this.containsKey(key)) {
                return super.get(key);
            }
            else {
                return Collections.emptyList();
            }
        }
    };

    public Map<String, List<T>> getMailBox() {
        return messages;
    }

    @Override
    public void accept(IMessage<T> message) {
        List<T> list = messages.get(message.getTo());
        if (list.size() == 0) {
            list = new ArrayList<>();
        }
        list.add(message.getContent());
        messages.put(message.getTo(), list);
    }
}
