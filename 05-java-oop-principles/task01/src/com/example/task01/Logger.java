package com.example.task01;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Logger {
    enum LogLevel {
        INFO,
        ERROR,
        WARNING,
        DEBUG,
    }

    private LogLevel logLevel = LogLevel.DEBUG;
    private final String name;

    private static final HashMap<String, Logger> loggersHashMap = new HashMap<>();

    public Logger(String name) {
        this.name = name;
        loggersHashMap.put(name, this);
    }

    public static Logger getLogger(String name) {
        if (loggersHashMap.containsKey(name))
            return loggersHashMap.get(name);
        return new Logger(name);
    }

    public void log(LogLevel logLevel, String message) {
        if (this.logLevel.ordinal() < logLevel.ordinal()) return;

        String date = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());

        System.out.println(MessageFormat.format("[{0}] {1} {2} - {3}", logLevel, date, name, message));
    }

    public void log(LogLevel logLevel, String pattern, Object... args) {
        log(logLevel, MessageFormat.format(pattern, args));
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void info(String pattern, Object... args) {
        log(LogLevel.INFO, pattern, args);
    }

    public void warning(String message) {
        log(LogLevel.WARNING, message);
    }

    public void warning(String pattern, Object... args) {
        log(LogLevel.WARNING, pattern, args);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    public void error(String pattern, Object... args) {
        log(LogLevel.ERROR, pattern, args);
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void debug(String pattern, Object... args) {
        log(LogLevel.DEBUG, pattern, args);
    }

    public LogLevel getLevel() {
        return logLevel;
    }

    public void setLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public String getName() {
        return name;
    }
}
