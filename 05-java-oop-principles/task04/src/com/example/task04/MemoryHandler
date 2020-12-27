package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final MessageHandler messageHandler;
    private final ArrayList<String> buffer = new ArrayList<>();
    private final long capacity;

    public MemoryHandler(MessageHandler messageHandler, long capacity) {
        this.messageHandler = messageHandler;
        this.capacity = capacity;
    }

    @Override
    public void handleMessage(String message) {
        buffer.add(message);
        if (buffer.size() >= capacity) {
            handle();
        }
    }

    public void handle() {
        for (String message : buffer) {
            messageHandler.handleMessage(message);
        }
        buffer.clear();
    }
}
