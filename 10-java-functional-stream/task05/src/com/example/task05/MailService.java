package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Content<T>> {
    HashMap<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, Collections.emptyList());
        }
    };

    public HashMap<String, List<T>> getMailBox() {
        return mailBox;
    }

    public void accept(Content<T> tiContent) {
        if (mailBox.containsKey(tiContent.getTo()))
            mailBox.get(tiContent.getTo()).add(tiContent.getContent());
        else {
            ArrayList<T> arrayList = new ArrayList<>();
            arrayList.add(tiContent.getContent());
            mailBox.put(tiContent.getTo(), arrayList);
        }
    }

    public Consumer<Content<T>> andThen(Consumer<? super Content<T>> x) {
        Objects.requireNonNull(x);
        return (Content<T> y) -> {
            accept(y);
            x.accept(y);
        };
    }
}
