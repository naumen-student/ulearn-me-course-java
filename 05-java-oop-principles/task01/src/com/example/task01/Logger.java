package com.example.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Logger{

    private enum Levels {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private Levels level = Levels.DEBUG;
    final String name;
    private static HashMap<String, Logger> loggers;

    private Logger(String name) {
        this.name = name;
        loggers.put(name, this);
    }

    public String getName() {
        return this.name;
    }

    public static Logger getLogger(String name) {
        if (loggers.containsKey(name))
            return loggers.get(name);
        return new Logger(name);
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public Levels getLevel() {
        return this.level;
    }

    public void log(Levels level, String message) {
        if (level.ordinal() >= this.level.ordinal()) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh.mm.ss");
            String dateString = dateFormat.format(new Date());
            String logString = String.format("[{0}] {1} {2} - {3}", level, dateString, name, message);
            System.out.println(logString);
        }
    }

    public void log(Levels level, String pattern, Object... args) {
        log(level, String.format(pattern, args));
    }

    public void debug(String message) {
        log(Levels.DEBUG, message);
    }

    public void debug(String pattern, Object... args) {
        log(Levels.DEBUG, pattern, args);
    }

    public void info(String message) {
        log(Levels.INFO, message);
    }

    public void info(String pattern, Object... args) {
        log(Levels.INFO, pattern, args);
    }

    public void warning(String message) {
        log(Levels.WARNING, message);
    }

    public void warning(String pattern, Object... args) {
        log(Levels.WARNING, pattern, args);
    }

    public void error(String message) {
        log(Levels.ERROR, message);
    }

    public void error(String pattern, Object... args) {
        log(Levels.ERROR, pattern, args);
    }
}