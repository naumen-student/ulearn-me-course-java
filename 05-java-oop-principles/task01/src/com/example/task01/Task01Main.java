package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

class Logger {
    private String name;
    public static HashMap<String, Logger> loggersNamesDictionary = new HashMap<String, Logger>();
    public Level level;
    public String message;

    public void printMessage() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.printf("[%s] %s %s - %s", level, dateFormat.format(date) , name , message);
    }

    public Logger(String name) {
        this.name = name;
        loggersNamesDictionary.put(name, this);
    }

    public void debug(String message) {
        Level newLevel = Level.DEBUG;
        if (level.ordinal() > newLevel.ordinal()) { return; }
        level = newLevel;
        this.message = message;
        printMessage();
    }

    public void debug(String pattern, Object...params) {
        Level newLevel = Level.DEBUG;
        if (level.ordinal() > newLevel.ordinal()) { return; }
        level = newLevel;
        this.message = String.format(pattern, params);
        printMessage();
    }

    public void info(String message) {
        Level newLevel = Level.INFO;
        if (level.ordinal() > newLevel.ordinal()) { return; }
        level = newLevel;
        this.message = message;
        printMessage();
    }

    public void info(String pattern, Object...params) {
        Level newLevel = Level.INFO;
        if (level.ordinal() > newLevel.ordinal()) { return; }
        level = newLevel;
        this.message = String.format(pattern, params);
        printMessage();
    }

    public void warning(String message) {
        Level newLevel = Level.WARNING;
        if (level.ordinal() > newLevel.ordinal()) { return; }
        level = newLevel;
        this.message = message;
        printMessage();
    }

    public void warning(String pattern, Object...params) {
        Level newLevel = Level.WARNING;
        if (level.ordinal() > newLevel.ordinal()) { return; }
        level = newLevel;
        this.message = String.format(pattern, params);
        printMessage();
    }

    public void error(String message) {
        level = Level.ERROR;
        this.message = message;
        printMessage();
    }

    public void error(String pattern, Object...params) {
        level = Level.ERROR;
        this.message = String.format(pattern, params);
        printMessage();
    }

    public void log(Level lv, String message) {
        level = lv;
        this.message = message;
        printMessage();
    }

    public void log(Level lv, String pattern, Object...params) {
        level = lv;
        this.message = String.format(pattern, params);
        printMessage();
    }

    public static Logger getLogger(String name) {
        if (loggersNamesDictionary.containsKey(name)) {
            return loggersNamesDictionary.get(name);
        }
        else {
            return new Logger(name);
        }
    }

    public void setLevel(Level lv) { level = lv; }

    public String getName() {
        return name;
    }

    public Level getLevel() { return level; }
}

public class Task01Main {
    public static void main(String[] args) {
    }
}
