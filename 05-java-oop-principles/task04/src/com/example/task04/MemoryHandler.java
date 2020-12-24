package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final ArrayList<String> messages = new ArrayList<>();
    private final long size;
    private MessageHandler handler;

    public MemoryHandler(long size, MessageHandler handler) {
        this.size = size;
        this.handler = handler;
    }

    @Override
    public void log(String message) {
        messages.add(message);
        if (messages.size() == size) {
            for (String msg : messages) {
                handler.log(msg);
            }
        }
        messages.clear();
    }
}