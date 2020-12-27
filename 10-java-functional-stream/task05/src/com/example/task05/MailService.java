package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IMailContent<T>> {
    private final Map<String, List<T>> mails;

    public MailService(){
        mails = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                return getOrDefault(key, new ArrayList<>());
            }
        };
    }

    @Override
    public void accept(IMailContent<T> mail) {
        String to = mail.getTo();
        T content = mail.getContent();
        if (!mails.containsKey(to)) {
            mails.put(to, new ArrayList<>());
        }
        mails.get(to).add(content);
    }

    public Map<String, List<T>> getMailBox() {
        return mails;
    }
}