package com.example.task04;

import java.text.SimpleDateFormat;
import java.util.*;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    String name;
    Level level;
    private static final Map<String, Logger> logs = new HashMap<>();
    private final ArrayList<MessageHandler> handlers = new ArrayList<>();

    public Logger(String name) {
        this.name = name;
        logs.put(name, this);
    }

    public void log(Level level, String message) {
        if(this.level != null && level.ordinal() < this.level.ordinal())
            return;
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.d");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        String msg = String.format("[%s] %s %s %s - %s%n",
                level,
                dateFormat.format(date),
                timeFormat.format(date),
                this.name,
                message);
        for (MessageHandler handler: handlers)
            handler.logMessage(msg);
    }

    public void log(Level lvl, String template, Object... args) {
        log(lvl, String.format(template, args));
    }

    public static Logger getLogger(String logName) {
        if (logs.containsKey(logName))
            return logs.get(logName);
        Logger logger = new Logger(logName);
        logs.put(logName, logger);
        return logger;
    }

    public void addHandler(MessageHandler handler) {
        handlers.add(handler);
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String template, Object... args) {
        log(Level.DEBUG, String.format(template, args));
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String template, Object... args) {
        log(Level.INFO, String.format(template, args));
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String template, Object... args) {
        log(Level.WARNING, String.format(template, args));
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String template, Object... args) {
        log(Level.ERROR, String.format(template, args));
    }
}
