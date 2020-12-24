package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer {

    private final Map<String, List<T>> box = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return containsKey(key) ? super.get(key) : Collections.emptyList();
        }
    };

    public Map<String, List<T>> getMailBox() {
        return box;
    }

    @Override
    public void accept(Object o) {
        IServiceItem<T> casted = (IServiceItem<T>) o;
        if (box.containsKey(casted.getTo()))
            box.get(casted.getTo()).add(casted.getSent());
        else {
            List<T> ll = new ArrayList<>();
            ll.add(casted.getSent());
            box.put(casted.getTo(), ll);
        }

    }
}
