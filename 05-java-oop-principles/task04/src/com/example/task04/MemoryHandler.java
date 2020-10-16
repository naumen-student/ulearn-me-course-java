package com.example.task04;

import java.io.IOException;
import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final ArrayList<String> messageList = new ArrayList<>();
    private final MessageHandler messageHandler;

    public MemoryHandler(MessageHandler handler) {
        this.messageHandler = handler;
    }

    @Override
    public void logMessage(String message) {
        messageList.add(message);
        for (String savedMessage : messageList) {
            try {
                messageHandler.logMessage(savedMessage);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        messageList.clear();
    }
}

