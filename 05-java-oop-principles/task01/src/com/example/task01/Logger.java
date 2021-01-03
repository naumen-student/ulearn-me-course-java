package com.example.task01;

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
    final private String loggerName;
    private final static ArrayList<Logger> loggers = new ArrayList<>();
    private final static ArrayList<String> names = new ArrayList<>();
    Level loggingLevel;

    Logger(String loggerName) {
        this.loggerName = loggerName;
        loggers.add(this);
        names.add(loggerName);
        loggingLevel = Level.DEBUG;
    }

    public String getName() {
        return loggerName;
    }

    public static Logger getLogger(String name) {
        if (names.contains(name)) {
            return loggers.get(names.indexOf(name));
        } else {
            Logger logger = new Logger(name);
            loggers.add(logger);
            return logger;
        }
    }

    public void debug(String debugMessage) {
        setMessage(Level.DEBUG, debugMessage);
    }

    public void info(String infoMessage) {
        setMessage(Level.INFO, infoMessage);
    }

    public void warning(String warningMessage) {
        setMessage(Level.WARNING, warningMessage);
    }

    public void error(String errorMessage) {
        setMessage(Level.ERROR, errorMessage);
    }


    public void debug(String format, Object... args) {
        setMessage(Level.DEBUG, format, args);
    }

    public void info(String format, Object... args) {
        setMessage(Level.INFO, format, args);
    }

    public void warning(String format, Object... args) {
        setMessage(Level.WARNING, format, args);
    }

    public void error(String format, Object... args) {
        setMessage(Level.ERROR, format, args);
    }

    private void setMessage(Level loggingLevel, String message, Object... args) {
        if (loggingLevel.ordinal() >= this.loggingLevel.ordinal()) {
            Date date = new Date();
            SimpleDateFormat dateNow = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss ");
            System.out.print("[" + loggingLevel.name() + "] " + dateNow.format(date) + loggerName + " - ");
            System.out.println(String.format(message, args));
        }
    }

    public void log(Level loggingLevel, String message) {
        setMessage(loggingLevel, message);
    }

    public void log(Level loggingLevel, String format, Object... args) {
        setMessage(loggingLevel, format, args);
    }

    public void setLevel(Level loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public Level getLevel() {
        return loggingLevel;
    }
}
