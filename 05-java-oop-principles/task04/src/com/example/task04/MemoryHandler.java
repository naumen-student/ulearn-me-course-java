package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler{

    private Logger logger;
    private int size;
    private ArrayList<String> messages = new ArrayList<>();

    public MemoryHandler(Logger logger) {
        this.logger = logger;
    }



    @Override
    public void log(String message){
        messages.add(message);
        if(size > messages.size()) sendAllMessages();
    }

    private void sendAllMessages() {
        for(String message : messages){
            System.out.println(message);;
        }
        messages.clear();
    }
}
