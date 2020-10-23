package com.example.task04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Logger {
    ArrayList<MessageHandler> handlers = new ArrayList<MessageHandler>();

    public String name;
    public LogLevel level;

    public Logger(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public static Logger getLogger(String name) {
        return Logger.getLogger(name);
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void debug(String format, Object... args) {
        log(LogLevel.DEBUG, format, args);
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void info(String format, Object... args) {
        log(LogLevel.INFO, format, args);
    }

    public void warning(String message) {
        log(LogLevel.WARNING, message);
    }

    public void warning(String format, Object... args) {
        log(LogLevel.WARNING, format, args);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    public void error(String format, Object... args) {
        log(LogLevel.ERROR, format, args);
    }

    public void log(LogLevel level, String message) {
        if (level.ordinal() > this.level.ordinal()) {
            String.format("[%s] %t %s - %s",
                    level,
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                    this.name,
                    message);
        }
        else return;
    }

    public void log(LogLevel level, String format, Object... args) {
        log(level, String.format(format, args));
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    public LogLevel getLevel() {
        return this.level;
    }
}