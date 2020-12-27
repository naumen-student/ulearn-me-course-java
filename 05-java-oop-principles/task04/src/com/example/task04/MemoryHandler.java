package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final long maxSize;
    private final ArrayList<String> messageList = new ArrayList<>();
    private final MessageHandler handler;

    public MemoryHandler(MessageHandler handler, long maxSize) {
        this.maxSize = maxSize;
        this.handler = handler;
    }

    @Override
    public void logMessage(String message) {
        messageList.add(message);
        if (messageList.size() >= maxSize) {
            for (String m : messageList) {
                handler.logMessage(m);
            }
            messageList.clear();
        }
    }

    public void logSavedMessages() {
        for (String m : messageList) {
            handler.logMessage(m);
        }
        messageList.clear();
    }
}
