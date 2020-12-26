package com.example.task01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Logger {
    private final String name;
    private Level level;
    private static final HashMap<String, Logger> loggers = new HashMap<>();

    public Logger(String name) {
        level = Level.DEBUG;
        this.name = name;
        loggers.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (loggers.containsKey(name))
            return loggers.get(name);
        return new Logger(name);
    }

    private enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String messageTemplate, Object... args) {
        log(Level.DEBUG, messageTemplate, args);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String messageTemplate, Object... args) {
        log(Level.INFO, messageTemplate, args);
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String messageTemplate, Object... args) {
        log(Level.WARNING, messageTemplate, args);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String messageTemplate, Object... args) {
        log(Level.ERROR, messageTemplate, args);
    }

    public void log(Level level, String message) {
        if (this.level.ordinal() <= level.ordinal()) {
            String result = String.format("[%s] %s %s %s - %s", level.toString(),
                    LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd")),
                    LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")), name, message);
            System.out.println(result);
        }
    }

    public void log(Level level, String messageTemplate, Object... args) {
        log(level, String.format(messageTemplate, args));
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}
