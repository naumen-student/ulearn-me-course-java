package com.example.task04;

import java.util.*;
import java.text.SimpleDateFormat;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private final String name;
    private Level level;
    private static final HashMap<String, Logger> loggerHashMap = new HashMap<>();

    public Logger(String name) {
        this.name = name;
        loggerHashMap.put(name,this);
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (loggerHashMap.containsKey(name))
            return loggerHashMap.get(name);
        return new Logger(name);
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String format, Object... args) {
        log(Level.DEBUG, format, args);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String format, Object... args) {
        log(Level.INFO, format, args);
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String format, Object... args) {
        log(Level.WARNING, format, args);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String format, Object... args) {
        log(Level.ERROR, format, args);
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    private void log(Level level, String message) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        if (level.compareTo(this.level) >= 0) {
            System.out.printf("[%s] %s %s - %s",
                    level,
                    dateFormat.format(date),
                    this.name,
                    message);
        }
    }

    private void log(Level level, String message, Object... args) {
        log(level,String.format(message, args));
    }
}