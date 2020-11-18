package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IMessage<T>> {
    private final Map<String, List<T>> mailbox;

    public MailService() {
        this.mailbox = new HashMap<String, List<T>>(){
            @Override
            public List<T> get(Object key)
            {
                return super.getOrDefault(key, new ArrayList<>());
            }
        };
    }

    @Override
    public void accept(IMessage<T> message) {
        if (!mailbox.containsKey(message.getTo()))
            mailbox.put(message.getTo(), new ArrayList<T>());
        mailbox.get(message.getTo()).add(message.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return mailbox;
    }
}
