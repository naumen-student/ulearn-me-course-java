package com.example.task04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    private final ArrayList<MessageHandler> handlers = new ArrayList<>();

    public static Logger getLogger(String name) {
        Logger logger = new Logger();
        logger.name = name;
        return logger;
    }

    public void addHandler(MessageHandler handler) {
        if (!handlers.contains(handler)) {
            handlers.add((handler));
        }
    }

    public String getName() {
        return name;
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

    public void log(Level level, String message) {
        if (level.compareTo(this.level) >= 0)
            for (MessageHandler handler : handlers)
                handler.handleMessage(String.format(" [%s] %d %s - %s", new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date()), this.name, message));
    }

    public void log(Level level, String format, Object... args) {
        log(level, String.format(format, level.name(), args));
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
