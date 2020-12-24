package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IntMail<T>> {

    public final Map<String, List<T>> mails;

    @Override
    public void accept(IntMail<T> mail) {
        String to = mail.getTo();
        T content = mail.getContent();
        if (!mails.containsKey(to)) {
            mails.put(to, new ArrayList<>());
        }
        mails.get(to).add(content);
    }

    public MailService() {
        mails = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                return getOrDefault(key, new ArrayList<>());
            }
        };
    }

    public Map<String, List<T>> getMailBox() {
        return mails;
    }

}