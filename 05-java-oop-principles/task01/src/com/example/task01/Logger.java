package com.example.task01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import static java.lang.String.format;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private final String name;
    private static final HashMap<String, Logger> loggers = new HashMap<>();
    private Level lvl;

    private Logger(String name) {
        this.name = name;
        loggers.put(name, this);
    }

    public String getLevel() {
        return lvl.name();
    }

    public void setLevel(Level level) {
        lvl = level;
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (loggers.containsKey(name))
            return loggers.get(name);
        return new Logger(name);
    }

    public void log(Level levels, String message) {
        if (levels.ordinal() < lvl.ordinal()) return;
        String curDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
        System.out.println(format("[{0}] {1} {2} - {3}", levels, curDateTime, name, message));
    }

    public void log(Level levels, String message, Object... args) {
        log(levels, String.format(message,args));
    }

    public void debug(String mes) {
        log(Level.DEBUG, mes);
    }

    public void debug(String mes, Object... args) {
        log(Level.DEBUG, mes, args);
    }

    public void info(String mes) {
        log(Level.INFO, mes);
    }

    public void info(String mes, Object... args) {
        log(Level.INFO, mes, args);
    }

    public void warning(String mes) {
        log(Level.WARNING, mes);
    }

    public void warning(String mes, Object... args) {
        log(Level.WARNING, mes, args);
    }

    public void error(String mes) {
        log(Level.ERROR, mes);
    }

    public void error(String mes, Object... args) {
        log(Level.ERROR, mes, args);
    }
}
