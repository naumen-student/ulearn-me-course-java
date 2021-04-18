package com.example.task04;
import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final long size;
    private final ArrayList<String> messages = new ArrayList<>();
    private final MessageHandler handler;

    public MemoryHandler(long size, MessageHandler handler) {
        this.handler = handler;
        this.size = size;
    }

    @Override
    public void log(String message) {
        messages.add(message);
        if (messages.size() >= size) {
            for (String savedMessage : messages) {
                handler.log(savedMessage);
            }
            messages.clear();
        }
    }
}
