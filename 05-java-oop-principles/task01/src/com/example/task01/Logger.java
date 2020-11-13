package com.example.task01;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Logger {
    private static final HashMap<String, Logger> loggerDict = new HashMap<String, Logger>();
    private String name;
    private Level lvl;
    private Date date;
    private Time time;
    private String message;

    public Logger(String name) {
        this.name = name;
    }

    enum Level {
        ERROR,
        WARNING,
        INFO,
        DEBUG
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (loggerDict.containsKey(name)) {
            return loggerDict.get(name);
        }
        else {
            Logger logger = new Logger(name);
            loggerDict.put(name, logger);
            return logger;
        }

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
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("YYYY:MM:DD HH:MM:SS");
        System.out.println(String.format("[%a], %b %c - %d", level, format.format(date), name, message));
    }


}