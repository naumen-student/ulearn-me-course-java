package com.example.task01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private Level level;
    private String name;

    public static Logger getLogger(String name) {
        Logger logger = new Logger();
        logger.name = name;
        return logger;
    }

    public String getName() {
        return name;
    }

    public void debug(String message) {
        System.out.println(log(Level.DEBUG, message));
    }

    public void debug(String format, Object... args) {
        System.out.println(String.format(format, args));
    }

    public void info(String message) {
        System.out.println(log(Level.INFO, message));
    }

    public void info(String format, Object... args) {
        System.out.println(String.format(format, args));
    }

    public void warning(String message) {
        System.out.println(log(Level.WARNING, message));
    }

    public void warning(String format, Object... args) {
        System.out.println(String.format(format, args));
    }

    public void error(String message) {
        System.out.println(log(Level.ERROR, message));
    }

    public void error(String format, Object... args) {
        System.out.println(String.format(format, args));
    }

    public String log(Level level, String message) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        return String.format(" [%s] %d %s - %s", new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date()), this.name, message);
    }

    public String log(Level level, String format, Object... args) {
        return String.format(format, level.name(), args);
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
