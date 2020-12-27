package com.example.task04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Logger {
    public String name;
    private Levels level = Levels.DEBUG;
    private static final HashMap<String, Logger> map = new HashMap<>();
    private static final ArrayList<MessageHandler> handlers = new ArrayList<>();

    public enum Levels {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public Logger(String name, MessageHandler messageHandler) {
        this.name = name;
        map.put(name, this);
        handlers.add(messageHandler);
    }

    public Logger(String name) {
        this.name = name;
        map.put(name, this);
        handlers.add(new ConsoleHandler());
    }

    public String getName() {
        return this.name;
    }

    public static Logger getLogger(String name) {
        Logger logger = map.get(name);
        if (logger == null) {
            logger = new Logger(name);
        }
        return logger;
    }

    public void addHandler(MessageHandler messageHandler) {
        handlers.add(messageHandler);
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public Levels getLevel() {
        return this.level;
    }

    public void debug(String message) {
        log(Levels.DEBUG, message);
    }

    public void debug(String template, Object... args) {
        log(Levels.DEBUG, template, args);
    }

    public void info(String message) {
        log(Levels.INFO, message);
    }

    public void info(String template, Object... args) {
        log(Levels.INFO, template, args);
    }

    public void warning(String message) {
        log(Levels.WARNING, message);
    }

    private void warning(String template, Object... args) {
        log(Levels.WARNING, template, args);
    }

    public void error(String message) {
        log(Levels.ERROR, message);
    }

    public void error(String template, Object... args) {
        log(Levels.ERROR, template, args);
    }

    public void log(Levels level, String message) {
        if (this.level.ordinal() > level.ordinal()) {
            return;
        }
        setLevel(level);
        Date dateNow = new Date();
        SimpleDateFormat formatForDate = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String template = "[%s] %s %s - %s";
        String result = String.format(template, level, formatForDate.format(dateNow), name, message);
        for (MessageHandler messageHandler : handlers) {
            messageHandler.handleMessage(result);
        }
    }

    public void log(Levels level, String template, Object... args) {
        log(level, String.format(template, args));
    }
}
