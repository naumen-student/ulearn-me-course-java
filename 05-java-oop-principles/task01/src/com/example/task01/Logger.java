package com.example.task01;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private final String name;
    private static final Map<String, Logger> logs = new HashMap<String, Logger>();
    private Level lev;

    public Logger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (logs.containsKey(name))
            return logs.get(name);
        else {
            Logger log = new Logger(name);
            logs.put(name, log);
            return log;
        }
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String t, Object... messageArgs) {
        log(Level.DEBUG, t, messageArgs);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String t, Object... messageArgs) {
        log(Level.INFO, t, messageArgs);
    }


    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String t, Object... messageArgs) {
        log(Level.WARNING, t, messageArgs);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String t, Object... messageArgs) {
        log(Level.ERROR, t, messageArgs);
    }

    public void log(Level level, String message) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy.mm.dd hh.MM.ss");
        Date date = new Date();
        String res = String.format("[%s] %s %s %s - %s", level, dateFormat.format(date), name, message);
        System.out.println(res);
    }

    public void log(Level level, String t, Object... messageArgs) {
        log(level, String.format(t, messageArgs));
    }

    public void setLevel(Level lev) {
        this.lev = lev;
    }

    public int getLevel() {
        return lev.ordinal();
    }
}

