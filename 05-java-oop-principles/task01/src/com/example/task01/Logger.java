package com.example.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

public class Logger {

    private final String name;
    private static final Hashtable<String, Logger> loggers = new Hashtable<>();
    private logLevel level;

    enum logLevel {

        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private Logger(String name) {

        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public static Logger getLogger(String name) {

        if (!loggers.containsKey(name)) {
            loggers.put(name, new Logger(name));
        }
        return new Logger(name);
    }

    public void setLevel(logLevel level) {

        this.level = level;
    }

    public logLevel getLevel() {
        return this.level;
    }

    public void debug(String message) {

        this.log(logLevel.DEBUG, message);
    }

    public void debug(String format, Object... params) {

        this.log(logLevel.DEBUG, format, params);
    }

    public void info(String message) {

        this.log(logLevel.INFO, message);
    }

    public void info(String format, Object... params) {

        this.log(logLevel.INFO, format, params);
    }

    public void warning(String message) {

        this.log(logLevel.WARNING, message);
    }

    public void warning(String format, Object... params) {

        this.log(logLevel.WARNING, format, params);
    }

    public void error(String message) {
        this.log(logLevel.ERROR, message);

    }

    public void error(String format, Object... params) {
        this.log(logLevel.ERROR, format, params);

    }

    public void log(logLevel level, String message) {

        if (level.ordinal() >= getLevel().ordinal()) {

            Date date = new Date();
            DateFormat formattedDate = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
            System.out.printf("[{0}] {1} {2} - {3}%n",
                    level,
                    formattedDate,
                    this.name,
                    message);
        }
    }

    public void log(logLevel level, String format, Object... params) {
        log(level, String.format(format, params));
    }
}
