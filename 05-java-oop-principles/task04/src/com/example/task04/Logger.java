package com.example.task04;

import org.assertj.core.internal.bytebuddy.asm.Advice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class Logger implements MessageHandler {
    protected String loggerName;
    private final static ArrayList<Logger> loggers = new ArrayList<>();
    private final static ArrayList<String> names = new ArrayList<>();
    protected Level loggingLevel;

    Logger() {
        loggerName = "Unnamed";
    }
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
            throw new ArrayIndexOutOfBoundsException("No logger with this name exists");
        }
    }

    public void setLevel(Level loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public Level getLevel() {
        return loggingLevel;
    }

    protected String messageBuild(Level loggingLevel, String message, Object... args) {
        return "[" + loggingLevel.name() + "] "
                + new SimpleDateFormat("yyyy.MM.dd hh:mm:ss ").format(new Date())
                + loggerName + " - " + String.format(message, args) + String.format("\n");
    }

    public void log(Level level, String message, Object... args) {

    }

    public void debug(String message, Object... args) {
        this.log(Level.DEBUG, message, args);
    }

    public void info(String message, Object... args) {
        this.log(Level.INFO, message, args);
    }

    public void warning(String message, Object... args) {
        this.log(Level.WARNING, message, args);
    }

    public void error(String message, Object... args) {
        this.log(Level.ERROR, message, args);
    }
}
