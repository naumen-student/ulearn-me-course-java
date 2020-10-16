package com.example.task04;

import java.util.ArrayList;

public class MemoryHandler implements MessageHandler {
    private final ArrayList<String> buffer = new ArrayList<>();
    private final long bufferSize;
    private final MessageHandler handler;

    public MemoryHandler(MessageHandler handler, long bufferSize) {
        this.bufferSize = bufferSize;
        this.handler = handler;
    }

    @Override
    public void log(Logger.Level level, String message) {
        buffer.add(message);
        if (buffer.size() >= bufferSize) {
            for (String msg : buffer) {
                handler.log(level, msg);
            }
            buffer.clear();
        }
    }

    @Override
    public void log(Logger.Level level, String format, Object... args) {
        log(level, String.format(format, args));
    }
}
