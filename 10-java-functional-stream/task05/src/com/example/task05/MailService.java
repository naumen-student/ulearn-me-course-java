package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer {
    Map<String, List<T>> mailBox = new MyHashMap<>();

    @Override
    public void accept(Object o) {
        Mail mail = (Mail) o;
        List list;
        if (mailBox.containsKey(mail.getTo())) {
            list = mailBox.get(mail.getTo());
        }
        else {
            list = new ArrayList();
            mailBox.put(mail.getTo(), list);
        }
        list.add(mail.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
