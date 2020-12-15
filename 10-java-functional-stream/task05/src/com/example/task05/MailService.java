package com.example.task05;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
public class MailService<T> implements Consumer <IMessages<T>> {
    Map<String, List<T>> mailbox;

    public MailService() {
        this.mailbox = new HashMap<String, List<T>>() {
            public List<T> get(Object key) {
                return super.getOrDefault(key, new ArrayList<>());
            }
        };
    }

    public void accept(IMessages<T> tiMessage) {
        if (!this.mailbox.containsKey(tiMessage.getTo())){
            ArrayList<T> contents = new ArrayList<>();
            contents.add(tiMessage.getContent());
            this.mailbox.put(tiMessage.getTo(), contents);
        } else{
            this.mailbox.get(tiMessage.getTo()).add(tiMessage.getContent());
        }
    }

    public Map<String, List<T>> getMailBox(){
        return this.mailbox;
    }

}