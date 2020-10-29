package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final long size;
    private final ArrayList<String> messages = new ArrayList<>();
    private final MessageHandler handler;

    public MemoryHandler(long size, MessageHandler handler) {
        this.size = size;
        this.handler = handler;
    }

    @Override
    public void handleMessage(String message) {
        messages.add(message);
        if (messages.size() >= size) {
            for (String savedMessage : messages) {
                handler.handleMessage(savedMessage);
            }
            messages.clear();
        }
    }
}