package com.example.task04;

public class MemoryHandler implements MessageHandler{
    @Override
    public void log(Level severityLevel, String message) {

    }

    @Override
    public void log(Level severityLevel, String template, Object... args) {
        log(severityLevel, String.format(template, args));
    }
}
