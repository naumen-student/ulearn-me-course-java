package com.example.task04;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;

import static java.text.MessageFormat.*;

public class Logger {
    public enum Levels {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private Levels level;
    private final String name;
    private static final Map<String, Logger> loggers = new HashMap<>();
    private ArrayList<MessageHandler> handlers = new ArrayList<>();

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

    public void addHandler(MessageHandler handler) {
        handlers.add(handler);
    }

    public String getName() {
        return name;
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public Levels getLevel() {
        return level;
    }

    public void log(Levels level, String message) {
        if (level != null && getLevel().ordinal() > level.ordinal())
            return;

        System.out.println(format("[{0}] {1} {2} - {3}",
                level,
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss")),
                name, message));
    }

    public void log(Levels level, String format, Object... args) {
        log(level, format(format, args));
    }

    public void debug(String message) {
        log(Levels.DEBUG, message);
    }

    public void debug(String format, Object... args) {
        log(Levels.DEBUG, format, args);
    }

    public void info(String message) {
        log(Levels.INFO, message);
    }

    public void info(String format, Object... args) {
        log(Levels.INFO, format, args);
    }

    public void warning(String message) {
        log(Levels.WARNING, message);
    }

    public void warning(String format, Object... args) {
        log(Levels.WARNING, format, args);
    }

    public void error(String message) {
        log(Levels.ERROR, message);
    }

    public void error(String format, Object... args) {
        log(Levels.ERROR, format, args);
    }
}