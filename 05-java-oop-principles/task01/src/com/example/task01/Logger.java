package com.example.task01;

import java.util.*;
import java.text.SimpleDateFormat;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private String name;
    private Level level;

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        Logger logger = new Logger();
        logger.name=name;
        return logger;
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String format, Object... args) {
        log(Level.DEBUG, format, args);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String format, Object... args) {
        log(Level.INFO, format, args);
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String format, Object... args) {
        log(Level.WARNING, format, args);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String format, Object... args) {
        log(Level.ERROR, format, args);
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void log(Level level, String message) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        if (level.compareTo(this.level) >= 0) {
            System.out.printf("[%s] %s %s - %s",
                    level,
                    dateFormat.format(date),
                    this.name,
                    message);
        }
    }

    public void log(Level level, String message, Object... args) {
        log(level,String.format(message, args));
    }
}
