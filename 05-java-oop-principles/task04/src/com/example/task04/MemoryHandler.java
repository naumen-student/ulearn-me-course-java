package com.example.task04;

import java.io.IOException;
import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final ArrayList<String> messages = new ArrayList<>();
    private final MessageHandler messageHandler;
    private final int limit;
    public MemoryHandler(MessageHandler h, int limit) {
        messageHandler = h;
        this.limit = limit;
    }

    public void handleParent() throws IOException {
        for (String m: messages) {
            messageHandler.handle(m);
        }
    }

    @Override
    public void handle(String message) throws IOException {
        messages.add(message);
        if (messages.size() == limit) {
            handleParent();
        }
    }
}
