package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.*;


public class Logger {

    private String name;
    private static List<Logger> logLogger = new ArrayList();

    public enum Level {DEBUG, INFO, WARNING, ERROR}

    private Level level = Level.DEBUG;

    public Logger(String name) {
        this.name = name;
    }

    public void log(Level level, String message) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String result = String.format("[%s] %s %s - %s", level, formatForDateNow.format(dateNow), name, message);
        System.out.println(result);
    }

    public void log(Level level, String format, Object... message) {
        if (level.ordinal() > this.level.ordinal()) {
            log(level, String.format(format, message));
        }
    }

    public static Logger getLogger(String name) {
        boolean flag = false;
        Logger log = null;
        for (Logger logger : logLogger) {
            if (logger.getName().equals(name)) {
                log = logger;
                flag = true;
                break;
            }
        }
        if (flag) {
            return log;
        } else {
            log = new Logger(name);
            logLogger.add(log);
            return log;
        }
    }


    public String getName() {
        return name;
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String format, Object... message) {
        log(Level.DEBUG, format, message);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String format, Object... message) {
        log(Level.INFO, format, message);
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String format, Object... message) {
        log(Level.WARNING, format, message);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String format, Object... message) {
        log(Level.ERROR, format, message);
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}