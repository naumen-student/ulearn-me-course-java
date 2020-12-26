package com.example.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private static final Map<String, Logger> logs = new HashMap<String, Logger>();
    private final String name;
    private Level level;

    public void debug(String message){
        if (Level.DEBUG.compareTo(level) >= 0)
            log(Level.DEBUG, message);
    }

    public void debug(String message, Object... messageArgs){
        if (Level.DEBUG.compareTo(level) >= 0)
            log(level, message, messageArgs);
    }

    public void info(String message){
        if (Level.INFO.compareTo(level) >= 0)
            log(level, message);
    }

    public void info(String message, Object... messageArgs){
        if (Level.INFO.compareTo(level) >= 0)
            log(level, message, messageArgs);
    }

    public void warning(String message){
        if (Level.WARNING.compareTo(level) >= 0)
            log(level, message);
    }

    public void warning(String message, Object... messageArgs){
        if (Level.WARNING.compareTo(level) >= 0)
            log(level, message, messageArgs);
    }

    public void error(String message){
        if (Level.ERROR.compareTo(level) >= 0)
            log(level, message);
    }

    public void error(String message, Object... messageArgs){
        if (Level.ERROR.compareTo(level) >= 0)
            log(level, message, messageArgs);
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public Logger(String name) {
        this.name = name;
    }

    public static Logger getLogger(String name) {
        if (logs.containsKey(name))
            return logs.get(name);
        else {
            Logger log = new Logger(name);
            return log;
        }

    }

    public void log(Level level, String message) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy mm dd hh mm ss");
        Date date = new Date();
        String result = String.format("[%s] %s %s %s - %s", level, dateFormat.format(date), name, message);
        System.out.println(result);
    }

    public void log(Level level, String message, Object... messageArgs){
        log(level, String.format(message, messageArgs));
    }
}
