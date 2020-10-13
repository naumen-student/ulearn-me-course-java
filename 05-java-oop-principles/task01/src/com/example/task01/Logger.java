package com.example.task01;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Logger {
    private final static HashMap<String, Logger> loggerHashMap = new HashMap<>();

    public static Logger getLogger(String name) {
        if (loggerHashMap.containsKey(name)) {
            return loggerHashMap.get(name);
        }
        return new Logger(name);
    }

    private final String name;
    private Level level = Level.DEBUG;

    public Logger(String name) {
        this.name = name;
        loggerHashMap.put(name, this);
    }

    enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    private void log(Level level, String message) {
        if(level.compareTo(this.level) >= 0) {
            String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
            System.out.printf("[%S] %s %s - %s%n", level, dateTime, name, message);
        }
    }

    private void log(Level level, String pattern, Object... args) {
        log(level, String.format(pattern, args));
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String pattern, Object... args) {
        log(Level.DEBUG, pattern, args);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String pattern, Object... args) {
        log(Level.INFO, pattern, args);
    }
    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String pattern, Object... args) {
        log(Level.WARNING, pattern, args);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String pattern, Object... args) {
        log(Level.ERROR, pattern, args);
    }
}
