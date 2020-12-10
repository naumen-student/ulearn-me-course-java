package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class Service<T> implements Consumer<IContent<T>> {
    private final java.util.Map mailBox;

    public Service() {
        mailBox = new Map<>();
    }

    public java.util.Map getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(IContent<T> tiContent) {
        if (mailBox.containsKey(tiContent.getTo())) {
            mailBox.get(tiContent.getTo()).add(tiContent.getContent());
        } else {
            mailBox.put(tiContent.getTo(), new ArrayList<T>() {{
                add(tiContent.getContent());
            }});
        }
    }
}
