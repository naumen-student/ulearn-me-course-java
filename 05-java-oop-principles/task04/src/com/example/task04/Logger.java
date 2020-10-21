package com.example.task04;

import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.Date;
import java.util.ArrayList;

public class Logger {
    public String logName;
    public static final Hashtable<String, Logger> loggers = new Hashtable<String, Logger>();
    public LogLevels level;
    private static final ArrayList<MessageHandler> handlers = new ArrayList<>();

    public Logger(String name, MessageHandler messageHandler) {
        logName = name;
        level = LogLevels.DEBUG;
        loggers.put(name, this);
        handlers.add(messageHandler);
    }

    public Logger(String name) {
        logName = name;
        level = LogLevels.DEBUG;
        loggers.put(name, this);
        handlers.add(new ConsoleHandler());
    }

    public String getName() {
        return logName;
    }

    public static Logger getLogger(String name) {
        return new Logger(name);
    }

    public void addHandler(MessageHandler messageHandler) {
        handlers.add(messageHandler);
    }

    public enum LogLevels {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public void log(LogLevels level, String message) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String result = String.format("[%s] %s %s - %s", level, dateFormat.format(date), logName, message);
        for (MessageHandler messageHandler : handlers) {
            messageHandler.handleMessage(result);
        }
    }

    public void log(LogLevels level, String message, Object... args) {
        log(level, String.format(message, args));
    }

    public void debug(String message){
        log(LogLevels.DEBUG, message);
    }

    public void debug(String message, Object... args) {
        log(LogLevels.DEBUG, message, args);
    }

    public void info(String message) {
        log(LogLevels.INFO, message);
    }

    public void info(String message, Object... args) {
        log(LogLevels.INFO, message, args);
    }

    public void warning(String message) {
        log(LogLevels.WARNING, message);
    }

    public void warning(String message, Object... args) {
        log(LogLevels.WARNING, message, args);
    }

    public void error(String message) {
        log(LogLevels.ERROR, message);
    }

    public void error(String message, Object... args) {
        log(LogLevels.ERROR, message, args);
    }

    public void setLevel(LogLevels level) {
        this.level = level;
    }

    public LogLevels getLevel() {
        return level;
    }
}
