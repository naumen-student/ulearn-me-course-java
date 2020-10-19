package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Date;

public class Logger {
    public static final HashMap<String, Logger> loggers = new HashMap<>();

    private final String logName;
    private Levels level;

    public Logger(String name) {
        logName = name;
        level = Levels.DEBUG;
        loggers.put(name, this);
    }

    public String getName() {
        return logName;
    }

    public static Logger getLogger(String name) {
        return Logger.loggers.getOrDefault(name, new Logger(name));
    }

    public Levels getLevel() {
        return level;
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public void log(Levels level, String message) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String result = String.format("[%s] %s %s - %s", level, dateFormat.format(date), logName, message);
        System.out.println(result);
    }

    public void log(Levels level, String message, Object... args) {
        log(level, String.format(message, args));
    }

    public void debug(String message) {
        log(Levels.DEBUG, message);
    }

    public void debug(String message, Object... args) {
        log(Levels.DEBUG, message, args);
    }

    public void info(String message) {
        log(Levels.INFO, message);
    }

    public void info(String message, Object... args) {
        log(Levels.INFO, message, args);
    }

    public void warning(String message) {
        log(Levels.WARNING, message);
    }

    public void warning(String message, Object... args) {
        log(Levels.WARNING, message, args);
    }

    public void error(String message) {
        log(Levels.ERROR, message);
    }

    public void error(String message, Object... args) {
        log(Levels.ERROR, message, args);
    }

}