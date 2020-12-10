package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IMessages<T>>{

    private HashMap<String, List<T>>  mailBox;

    public MailService(){
        mailBox = new HashMap(){
            @Override
            public List<T> get(Object key) {
                if (!super.containsKey(key))
                    return new ArrayList<>();
                return (List<T>) super.get(key);
            }
        };
    }


    public HashMap<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(IMessages messages) {
        if (mailBox.containsKey(messages.getTo()))
            mailBox.get(messages.getTo()).add((T) messages.getContent());
        else{
            mailBox.put(messages.getTo(), new ArrayList<>());
            mailBox.get(messages.getTo()).add((T) messages.getContent());
        }

    }
}