package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {

    private final long size;
    private final ArrayList<String> messageSaver = new ArrayList<>();
    private final MessageHandler handler;

    public MemoryHandler(long size, MessageHandler handler) {
        this.size = size;
        this.handler = handler;
    }

    @Override
    public void logMessage(String message) {
        messageSaver.add(message);
        if (messageSaver.size() >= size) {
            for (String savedMessage : messageSaver) {
                handler.logMessage(savedMessage);
            }
            messageSaver.clear();
        }
    }
}
