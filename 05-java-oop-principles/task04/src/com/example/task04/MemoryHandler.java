package com.example.task04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MemoryHandler implements MessageHandler{
    private final MessageHandler messageHandler;
    private final ArrayList<String> messages;
    private final int memorySize;

    public MemoryHandler(MessageHandler handler, int memorySize){
        messageHandler = handler;
        messages = new ArrayList<>();
        this.memorySize = memorySize;
    }

    @Override
    public void log(Level severityLevel, String message) {
        if (memorySize <= (long) messages.size()) {
            for (String currentMessage : messages)
                messageHandler.log(severityLevel, currentMessage);
            messages.clear();
        }
    }

    @Override
    public void log(Level severityLevel, String template, Object... args) {
        log(severityLevel, String.format(template, args));
    }
}