package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final ArrayList<String> buffer = new ArrayList<>();
    private final long capacity;
    private final MessageHandler handler;

    public MemoryHandler(MessageHandler handler, long capacity) {
        this.capacity = capacity;
        this.handler = handler;
    }

    @Override
    public void log(Logger.Level level, String message) {
        buffer.add(message);
        if (buffer.size() >= capacity) {
            for (String msg : buffer) {
                handler.log(level, msg);
            }
            buffer.clear();
        }
    }

    @Override
    public void log(Logger.Level level, String pattern, Object... args) {
        log(level, String.format(pattern, args));
    }
}