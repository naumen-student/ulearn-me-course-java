package com.example.task04;

public interface MessageHandler {
    void log(Level loggingLevel, String message, Object... args);

    void debug(String message, Object... args);

    void info(String message, Object... args);

    void warning(String message, Object... args);

    void error(String message, Object... args);
}
