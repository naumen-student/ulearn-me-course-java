package com.example.task04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import java.util.List;

public class Logger {

    public enum Levels {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private static final HashMap<String, Logger> loggers = new HashMap<>();

    private final String name;
    private Levels level;
    private List<MessageHandler> handlers = new ArrayList<>();

    public Logger(String name) {
        this.name = name;
        loggers.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (!loggers.containsKey(name)) {
            loggers.put(name, new Logger(name));
        }
        return new Logger(name);
    }

    public Levels getLevel() {
        return level;
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public void log(Levels level, String message) {
        if (handlers.isEmpty())
            return;
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String result = String.format("[%s] %s %s - %s", level, dateFormat.format(date), name, message);
        for (MessageHandler handler : handlers)
            handler.logMessage(result);
    }

    public void log(Levels level, String message, Object... args) {
        log(level, String.format(message, args));
    }

    public void addMessageHandler(MessageHandler handler) {
        handlers.add(handler);
    }

    public void debug(String message) {
        log(Levels.DEBUG, message);
    }

    public void debug(String message, Object... args) {
        log(Levels.DEBUG, message, args);
    }

    public void info(String message) {
        log(Levels.INFO, message);
    }

    public void info(String message, Object... args) {
        log(Levels.INFO, message, args);
    }

    public void warning(String message) {
        log(Levels.WARNING, message);
    }

    public void warning(String message, Object... args) {
        log(Levels.WARNING, message, args);
    }

    public void error(String message) {
        log(Levels.ERROR, message);
    }

    public void error(String message, Object... args) {
        log(Levels.ERROR, message, args);
    }

}