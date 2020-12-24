package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IContent<T>> {
    private final HashMap<String, List<T>> mailBox;

    public MailService() {
        mailBox = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                if (!super.containsKey(key))
                    return new ArrayList<>();
                return super.get(key);
            }
        };
    }

    public HashMap<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(IContent<T> content) {
        if (!mailBox.containsKey(content.getTo())) mailBox.put(content.getTo(), new ArrayList<>());
        mailBox.get(content.getTo()).add(content.getContent());
    }
}
