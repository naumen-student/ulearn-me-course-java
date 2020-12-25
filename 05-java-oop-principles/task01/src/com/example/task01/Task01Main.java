package com.example.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private final String name;
    private Level level;
    private static final HashMap<String, Logger> loggers = new HashMap<>();

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
        return new Logger(name);
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void log(Level level, String message) {
        Date date = new Date();
        DateFormat dformat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        System.out.printf("[%s] %s %s - %s%n%n", level, dformat.format(date), name, message);
    }

    public void log(Level level, String template, Object... messageArgs) {
        log(level, String.format(template, messageArgs));
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String template, Object... messageArgs) {
        log(Level.DEBUG, template, messageArgs);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String template, Object... messageArgs) {
        log(Level.INFO, template, messageArgs);
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String template, Object... messageArgs) {
        log(Level.WARNING, template, messageArgs);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String template, Object... messageArgs) {
        log(Level.ERROR, template, messageArgs);
    }
}