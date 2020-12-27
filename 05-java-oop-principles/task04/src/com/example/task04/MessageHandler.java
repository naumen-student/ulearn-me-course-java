package com.example.task04;

public interface MessageHandler {
    void log(Level severityLevel, String message);

    void log(Level severityLevel, String template, Object ... args);
}