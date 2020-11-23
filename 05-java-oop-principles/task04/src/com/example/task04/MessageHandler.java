package com.example.task04;

public interface MessageHandler {
    void log(Logger.Level level, String message);
    void log(Logger.Level level, String pattern, Object... args);
}
