package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Date;

public class Logger {
    enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private String name;
    private Level level;
    private static final HashMap<String, Logger> loggerHashMap = new HashMap<>();

    public Logger (String name) {
        this.name = name;
        loggerHashMap.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (loggerHashMap.containsKey(name)) return loggerHashMap.get(name);
        return new Logger(name);
    }

    private String log(Level level, String message) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        return String.format("[%d], %d, %d", level, dateFormat.format(new Date()), name, message);
    }

    private void log(Level level, String message, Object ... args) {
        log(level, String.format(message, args));
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String messageTemplate, Object ... args) {
        log(Level.DEBUG, messageTemplate, args);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String messageTemplate, Object ... args) {
        log(Level.INFO, messageTemplate, args);
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String messageTemplate, Object ... args) {
        log(Level.WARNING, messageTemplate, args);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String messageTemplate, Object ... args) {
        log(Level.ERROR, messageTemplate, args);
    }
}