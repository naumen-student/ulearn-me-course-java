package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {

    public final MessageHandler finalHandler;
    public final int capacity;
    public final ArrayList<String> messages = new ArrayList<>();

    public MemoryHandler(MessageHandler finalHandler, int capacity) {
        this.finalHandler = finalHandler;
        this.capacity = capacity;
    }

    @Override
    public void handle(String message) {
        messages.add(message);
        if (messages.size() >= capacity) send();
    }

    public void send(){
        for(String message : messages){
            finalHandler.handle(message);
        }
        messages.clear();
    }
}
