package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IMail<T>> {

    private final Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new HashMap<>();
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(IMail<T> mail) {
        String to = mail.getTo();
        T content = mail.getContent();
        if (!mailBox.containsKey(to)) {
            mailBox.put(to, new ArrayList<>());
        }
        mailBox.get(to).add(content);
    }
}
