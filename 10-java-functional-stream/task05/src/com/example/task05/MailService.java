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

    public void accept(Content<T> content) {
        if (mailBox.containsKey(content.getTo()))
            mailBox.get(content.getTo()).add(content.getContent());
        else {
            ArrayList<T> arrayList = new ArrayList<>();
            arrayList.add(content.getContent());
            mailBox.put(content.getTo(), arrayList);
        }
    }

    public Consumer<Content<T>> andThen(Consumer<? super Content<T>> x) {
        Objects.requireNonNull(x);
        return (Content<T> y ) -> {
            accept(y);
            x.accept(y);
        };
    }
}
