package com.example.task04;

import java.util.HashMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private final String name;
    private static final HashMap<String, Logger> loggers = new HashMap<>();
    private Level level;

    public Logger(String name) {
        this.name = name;
        loggers.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (loggers.containsKey(name))
            return loggers.get(name);
        else return new Logger(name);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String template, Object... args) {
        log(Level.ERROR, template, args);
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String template, Object... args) {
        log(Level.DEBUG, template, args);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String template, Object... args) {
        log(Level.INFO, template, args);
    }

    public void log(Level severityLevel, String message, Object... args) {
        log(severityLevel, String.format(message, args));
    }

    public void log(Level severityLevel, String message) {
        if (level.ordinal() >= getLevel().ordinal()) {
            DateFormat date = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
            System.out.printf("[{0}] {1} {2} - {3}%n", level, date, this.name, message);
        }
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String template, Object... args) {
        log(Level.WARNING, template, args);
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}
