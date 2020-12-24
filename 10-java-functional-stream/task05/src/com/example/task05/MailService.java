package com.example.task05;

import javax.naming.ldap.HasControls;
import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer {

    private final Map<String, List<T>> box = new HashMap<String, List<T>>() {
        @Override
        public List<T> get (Object key){ return containsKey(key) ? super.get(key) : Collections.emptyList();}
    };

    public Map<String, List<T>> getMailBox() {return box;}

    @Override
    public void accept(Object obj) {
        IMessage<T> casted = (IMessage) obj;
        if (box.containsKey(casted.getTo())){
            box.get(casted.getTo()).add(casted.getSent());
        }else {
            List<T> list = new ArrayList<>();
            list.add(casted.getSent());
            box.put(casted.getTo(), list);
        }
    }
}
