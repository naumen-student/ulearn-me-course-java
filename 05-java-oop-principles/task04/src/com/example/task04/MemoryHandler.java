package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final MessageHandler handler;
    private final long maxSize;
    private final ArrayList<String> messages = new ArrayList<>();

    public MemoryHandler(MessageHandler handler, long maxSize) {
        this.handler = handler;
        this.maxSize = maxSize;
    }

    @Override
    public void logMessage(String msg) {
        messages.add(msg);
        if(messages.size() >= maxSize){
            for (String message: messages) {
                handler.logMessage(message);
            }
            messages.clear();
        }
    }

    public void forceLog() {
        for (String message: messages) {
            handler.logMessage(message);
        }
        messages.clear();
    }
}
