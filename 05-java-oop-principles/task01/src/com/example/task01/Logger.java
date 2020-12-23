package com.example.task01;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;
import static java.text.MessageFormat.*;

public class Logger {
    private enum levels {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private levels level;
    private final String name;
    private static final Map<String, Logger> loggers = new HashMap<>();

    public static Logger getLogger(String name) {
        if (!loggers.containsKey(name)) {
            loggers.put(name, new Logger(name));
        }
        return new Logger(name);
    }

    private Logger(String name) {
        this.name = name;
        loggers.put(name, this);
    }

    public String getName() {
        return name;
    }

    public void setLevel(levels level) {
        this.level = level;
    }

    public levels getLevel() {
        return level;
    }

    public void log(levels level, String message) {
        if (level != null && getLevel().ordinal() > level.ordinal())
            return;

        System.out.println(format("[{0}] {1} {2} - {3}",
                level,
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss")),
                name, message));
    }

    public void log(levels level, String format, Object... args) {
        log(level, format(format, args));
    }

    public void debug(String message) {
        log(levels.DEBUG, message);
    }

    public void debug(String format, Object... args) {
        log(levels.DEBUG, format, args);
    }

    public void info(String message) {
        log(levels.INFO, message);
    }

    public void info(String format, Object... args) {
        log(levels.INFO, format, args);
    }

    public void warning(String message) {
        log(levels.WARNING, message);
    }

    public void warning(String format, Object... args) {
        log(levels.WARNING, format, args);
    }

    public void error(String message) {
        log(levels.ERROR, message);
    }

    public void error(String format, Object... args) {
        log(levels.ERROR, format, args);
    }
}
