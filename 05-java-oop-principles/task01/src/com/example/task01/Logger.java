package com.example.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

enum Level{
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private static Logger logger = null;
    private final String name;
    private Level logLvl = null;

    public Logger(String name) {
        this.name = name;
        logger = this;
    }

    public static Logger getLogger(String name) {
        if (logger == null) {
            return new Logger(name);
        }
        else {
            return logger;
        }
    }

    public String getName() {
        return name;
    }

    public void setLevel(Level lvl) {
        logLvl = lvl;
    }

    public Level getLevel() {
        return logLvl;
    }

    private void log(Level level, String message){
        if (level.compareTo(logLvl) < 0)
            return;
        DateFormat dateForm = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        System.out.printf("[%s] %s %s - %s%n", level, dateForm.format(new Date()), name, message);
    }

    private void log(Level level, String format, Object... args){
        log(level, String.format(format,args));
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String form, Object... arguments) {
        log(Level.DEBUG, form, arguments);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String form, Object... arguments) {
        log(Level.INFO, form, arguments);
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String form, Object... arguments) {
        log(Level.WARNING, form, arguments);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String form, Object... arguments) {
        log(Level.ERROR, form, arguments);
    }
}
