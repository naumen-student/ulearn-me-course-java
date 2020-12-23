package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler{

    private ArrayList<String> messages = new ArrayList<>();
    MessageHandler messageHandler;
    private int size;

    public void MemoryHandler(MessageHandler messageHandler, int size){
        this.size = size;
        this.messageHandler = messageHandler;
    }

    @Override
    public void handler(String message){
        messages.add(message);
        if(size > messages.size()) sendAllMessages();
    }

    private void sendAllMessages() {
        for(String message : messages){
            messageHandler.handler(message);
        }
        messages.clear();
    }
}
