package com.example.task04;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

enum Level {
    ERROR,
    WARNING,
    INFO,
    DEBUG
}

public class Logger {
    private static final HashMap<String, Logger> loggerDict = new HashMap<String, Logger>();

    private String name;
    private Level lvl;


    public Logger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        return loggerDict.containsKey(name) ? loggerDict.get(name) : new Logger(name);
    }

    public void setLevel(Level level) {
        this.lvl = level;
    }

    public Level getLevel() {
        return this.lvl;
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String message, Object... args) {
        log(Level.DEBUG, message, args);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String message, Object... args) {
        log(Level.INFO, message, args);
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String message, Object... args) {
        log(Level.WARNING, message, args);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String message, Object... args) {
        log(Level.ERROR, message, args);
    }

    private void log(Level level, String message, Object... args) {
        log(level, String.format(message, args));
    }

    private void log(Level level, String message) {
        if(level.compareTo(level) >= 0) {
            String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
            System.out.printf("[%S] %s %s - %s%n", level, dateTime, name, message);
        }
    }
}
