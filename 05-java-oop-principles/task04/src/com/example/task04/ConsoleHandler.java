package com.example.task04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleHandler extends MessageHandler {
    private final String name;

    public ConsoleHandler(Logger logger) {
        this.name = logger.getName();
    }

    @Override
    public void log(Level level, String message) {
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
        System.out.printf("[%S] %s %s - %s%n", level, dateTime, name, message);
    }

    @Override
    public void log(Level level, String pattern, Object... args) {
        log(level, String.format(pattern, args));
    }
}