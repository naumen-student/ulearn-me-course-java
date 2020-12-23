package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<IData<T>> {

    private final Map<String, List<T>> mailBox = new HashMap<String, List<T>>(){
        @Override
        public List<T> get(Object key){
            return getOrDefault(key, new ArrayList<>());
        }
    };

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(IData<T> iContent) {
        if (mailBox.containsKey(iContent.getTo())) {
            mailBox.get(iContent.getTo()).add(iContent.getContent());
        } else {
            mailBox.put(iContent.getTo(), new ArrayList<T>() {{
                add(iContent.getContent());
            }});
        }
    }
}