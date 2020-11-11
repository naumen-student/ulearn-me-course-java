package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<C> implements Consumer<IHaveReceiverAndContent<String, C>>{
    private final Map<String, List<C>> receiverMessages = new HashMap<String, List<C>>(){
        @Override
        public List<C> get(Object key){
            return getOrDefault(key, new ArrayList<>());
        }
    };

    public Map<String, List<C>> getMailBox(){
        return receiverMessages;
    }

    @Override
    public void accept(IHaveReceiverAndContent<String, C> receiver){
        if ( !receiverMessages.containsKey(receiver.getTo()) )
            receiverMessages.put(receiver.getTo(), new ArrayList<>());
        receiverMessages.get(receiver.getTo()).add(receiver.getContent());
    }
}
