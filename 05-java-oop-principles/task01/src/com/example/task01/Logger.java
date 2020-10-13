package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Logger {
    String name;
    Level level;
    private static final Map<String, Logger> logs = new HashMap<>();

    public Logger(String name) {
        this.name = name;
        logs.put(name, this);
    }

    public void log(Level level, String message) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.d");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.printf(
                "[%s] %s %s %s - %s%n",
                level,
                dateFormat.format(date),
                timeFormat.format(date),
                this.name,
                message);
    }

    public void log(Level lvl, String template, Object... args) {
        log(lvl, String.format(template, args));
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String logName) {
        if (logs.containsKey(logName))
            return logs.get(logName);
        throw new IllegalArgumentException("Logger с таким именем не существует");
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String template, Object... args) {
        log(Level.DEBUG, String.format(template, args));
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String template, Object... args) {
        log(Level.INFO, String.format(template, args));
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String template, Object... args) {
        log(Level.WARNING, String.format(template, args));
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String template, Object... args) {
        log(Level.ERROR, String.format(template, args));
    }
}

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}
