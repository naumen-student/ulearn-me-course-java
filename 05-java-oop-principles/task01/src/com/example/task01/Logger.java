package com.example.task01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    public String name;
    public LoggerLevel level;

    public Logger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LoggerLevel getLevel() {
        return level;
    }

    public void setLevel(LoggerLevel level) {
        this.level = level;
    }

    public static Logger getLogger(String name) {
        return new Logger(name);
    }

    public void debug(String message) {
        log(LoggerLevel.DEBUG, message);
    }

    public void debug(String format, Object... args) {
        log(LoggerLevel.DEBUG, format, args);
    }

    public void info(String message) {
        log(LoggerLevel.INFO, message);
    }

    public void info(String format, Object... args) {
        log(LoggerLevel.INFO, format, args);
    }

    public void warning(String message) {
        log(LoggerLevel.WARNING, message);
    }

    public void warning(String format, Object... args) {
        log(LoggerLevel.WARNING, format, args);
    }

    public void error(String message) {
        log(LoggerLevel.ERROR, message);
    }

    public void error(String format, Object... args) {
        log(LoggerLevel.ERROR, format, args);
    }

    public void log(LoggerLevel level, String format, Object... args) {
        log(level, String.format(format, args));
    }

    public void log(LoggerLevel level, String message) {
        if (level.ordinal() > this.level.ordinal()) {
            String.format("[%s] %t %s - %s",
                    level,
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                    this.name,
                    message);
        }
        else return;
    }
}
