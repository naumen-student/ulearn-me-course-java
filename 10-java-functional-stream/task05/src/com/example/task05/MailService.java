package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IMessage<T>> {
    Map<String, List<T>> mailbox = new HashMap<>();

    public MailService() {
    }

    public void accept(IMessage<T> tiMessage) {
        if (!this.mailbox.containsKey(tiMessage.getTo())) {
            ArrayList<T> contents = new ArrayList<>();
            this.mailbox.put(tiMessage.getTo(), contents);
        }

        this.mailbox.get(tiMessage.getTo()).add(tiMessage.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return this.mailbox;
    }

}