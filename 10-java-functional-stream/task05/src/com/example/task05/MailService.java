package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<ISendingInformation<String, T>> {
    private final Map<String, List<T>> recipientAndMessages;

    public MailService(){
        recipientAndMessages = new HashMap<String, List<T>>(){
            @Override
            public List<T> get(Object key) {
                return getOrDefault(key, new ArrayList<>());
            };
        };
    }

    public Map<String, List<T>> getMailBox() {
        return recipientAndMessages;
    }

    @Override
    public void accept(ISendingInformation<String, T> sendingInformation) {
        String recipient = sendingInformation.getTo();
        List<T> messages = recipientAndMessages.get(recipient);
        if (messages.size() == 0)
            recipientAndMessages.put(recipient, messages);
        messages.add(sendingInformation.getContent());
    }
}
