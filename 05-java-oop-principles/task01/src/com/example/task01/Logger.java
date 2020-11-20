package com.example.task01;

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
    private static final HashMap<String, Logger> nameOfLoggerDict = new HashMap<>();
    private Level level;

    private Logger(String name) {
        this.name = name;
        nameOfLoggerDict.put(name, this);
    }
    public String getName(){
        return name;
    }
    public static Logger getLogger(String name) {
        return nameOfLoggerDict.containsKey(name) ? nameOfLoggerDict.get(name) : new Logger(name);
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

    private void log(Level lvl, String messageTemplate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");

        if (lvl.compareTo(level) >= 0) {
            System.out.printf("[%s] %s %s - %s", lvl, dateFormat.format(new Date()), this.name, messageTemplate);
        }
    }

    private void log(Level level, String messageTemplate, Object ... args) {
        log(level, String.format(messageTemplate, args));
    }

    public final void setLevel(Level lvl) {
        level = lvl;
    }

    public final Level getLevel() {
        return level;
    }
}
