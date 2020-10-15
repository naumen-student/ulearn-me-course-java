package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.String.format;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private Level level;
    private String name;

    public Logger() {
        this.name = name;
    }

    public static Logger getLogger(String name) {
        Logger logger = new Logger();
        logger.name = name;
        return logger;
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void log(Level level, String message) {
        if (this.level.ordinal() > level.ordinal()) return;
        String.format(" [{0}] {1} {2} - {3}", new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date()), this.name, message);
    }

    public void log(Level level, String format, Object... args) {
        log(level, format(format, args));
    }

    public void debug(String message) {
        log(level.DEBUG, message);
    }

    public void debug(String format, Object... args) {
        log(level.DEBUG, format, args);
    }

    public void info(String message) {
        log(level.INFO, message);
    }

    public void info(String format, Object... args) {
        log(level.INFO, format, args);
    }

    public void warning(String message) {
        log(level.WARNING, message);
    }

    public void warning(String format, Object... args) {
        log(level.WARNING, format, args);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String format, Object... args) {
        log(Level.ERROR, format, args);
    }
}
