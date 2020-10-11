package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Logger {
    public String name;
    private Level level = Level.DEBUG;
    private static final HashMap<String, Logger> loggers = new HashMap<>();

    private enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public Logger(String name) {
        this.name = name;
        loggers.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        Logger logger = loggers.get(name);
        if (logger == null) {
            logger = new Logger(name);
        }
        return logger;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return this.level;
    }

    public void debug(String massage) {
        log(Level.DEBUG, massage);
    }

    public void debug(String template, Object... args) {
        log(Level.DEBUG, template, args);
    }

    public void info(String massage) {
        log(Level.INFO, massage);
    }

    public void info(String template, Object... args) {
        log(Level.INFO, template, args);
    }

    public void warning(String massage) {
        log(Level.WARNING, massage);
    }

    private void warning(String template, Object... args) {
        log(Level.WARNING, template, args);
    }

    public void error(String massage) {
        log(Level.ERROR, massage);
    }

    public void error(String template, Object... args) {
        log(Level.ERROR, template, args);
    }

    public void log(Level level, String massage) {
        if (getLevel().ordinal() > level.ordinal()) {
            return;
        }
        setLevel(level);
        Date dateNow = new Date();
        SimpleDateFormat formatForDate = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String template = "[%s] %s %s - %s";
        String result = String.format(template, level, formatForDate.format(dateNow), name, massage);
        System.out.println(result);
    }

    public void log(Level level, String template, Object... args) {
        log(level, String.format(template, args));
    }
}
