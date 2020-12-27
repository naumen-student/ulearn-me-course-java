package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Logger {
    public String name;
    private Levels level = Levels.DEBUG;
    private static final HashMap<String, Logger> loggers = new HashMap<>();

    public enum Levels {
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

    public void setLevel(Levels level) {
        this.level = level;
    }

    public Levels getLevel() {
        return this.level;
    }

    public void debug(String massage) {
        log(Levels.DEBUG, massage);
    }

    public void debug(String template, Object... args) {
        log(Levels.DEBUG, template, args);
    }

    public void info(String massage) {
        log(Levels.INFO, massage);
    }

    public void info(String template, Object... args) {
        log(Levels.INFO, template, args);
    }

    public void warning(String massage) {
        log(Levels.WARNING, massage);
    }

    private void warning(String template, Object... args) {
        log(Levels.WARNING, template, args);
    }

    public void error(String massage) {
        log(Levels.ERROR, massage);
    }

    public void error(String template, Object... args) {
        log(Levels.ERROR, template, args);
    }

    public void log(Levels level, String massage) {
        if (this.level.ordinal() > level.ordinal()) {
            return;
        }
        setLevel(level);
        Date dateNow = new Date();
        SimpleDateFormat formatForDate = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String template = "[%s] %s %s - %s";
        String result = String.format(template, level, formatForDate.format(dateNow), name, massage);
        System.out.println(result);
    }

    public void log(Levels level, String template, Object... args) {
        log(level, String.format(template, args));
    }
}
