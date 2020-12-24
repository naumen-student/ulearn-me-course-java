package com.example.task05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IContent<T>> {
    private final Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new MyMap<>();
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(IContent<T> content) {
        if (mailBox.containsKey(content.getTo())) mailBox.get (content.getTo ()).add (content.getContent ());
        else mailBox.put (content.getTo (), new ArrayList<T> () {{
            add (content.getContent ());
        }});
    }
}