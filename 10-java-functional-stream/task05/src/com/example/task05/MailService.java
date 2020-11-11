package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<C> implements Consumer<IHaveReceiverAndContent<String, C>>{
    private final Map<String, List<C>> receiverMessages = new Map<String, List<C>>(){
        private final Map<String, List<C>> map = new HashMap<>();
        @Override
        public int size(){
            return map.size();
        }

        @Override
        public boolean isEmpty(){
            return map.isEmpty();
        }

        @Override
        public boolean containsKey(Object key){
            return map.containsKey(key);
        }

        @Override
        public boolean containsValue(Object value){
            return map.containsValue(value);
        }

        @Override
        public List<C> get(Object key){
            List<C> result = map.get(key);
            if (result == null)
                map.put((String) key, new ArrayList<>());
            return map.get(key);
        }

        @Override
        public List<C> put(String key, List<C> value){
            return map.put(key, value);
        }

        @Override
        public List<C> remove(Object key){
            return map.remove(key);
        }

        @Override
        public void putAll(Map<? extends String, ? extends List<C>> m){
            map.putAll(m);
        }

        @Override
        public void clear(){
            map.clear();
        }

        @Override
        public Set<String> keySet(){
            return map.keySet();
        }

        @Override
        public Collection<List<C>> values(){
            return map.values();
        }

        @Override
        public Set<Entry<String, List<C>>> entrySet(){
            return map.entrySet();
        }
    };

    public Map<String, List<C>> getMailBox(){
        return receiverMessages;
    }

    @Override
    public void accept(IHaveReceiverAndContent<String, C> receiver){
        if (!receiverMessages.containsKey(receiver.getTo()))
            receiverMessages.put(receiver.getTo(), new ArrayList<>());
        receiverMessages.get(receiver.getTo()).add(receiver.getContent());
    }
}
