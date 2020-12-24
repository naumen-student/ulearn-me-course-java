package com.example.task04;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {

    private final ArrayList<String> messages = new ArrayList<>();
    private final MessageHandler handler;
    private final long size;

    public MemoryHandler(long size, MessageHandler handler) {
        this.handler = handler;
        this.size = size;
    }

    public void log(String message) throws FileNotFoundException {
        messages.add(message);

        if (messages.size() >= size) {
            for (String savedMessage : messages) {
                handler.log(savedMessage);
            }
            messages.clear();
        }
    }

}