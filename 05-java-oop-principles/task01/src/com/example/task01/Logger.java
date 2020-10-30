package com.example.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Logger {
    private enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private final String name;
    private Level level = Level.DEBUG;
    private static HashMap<String, Logger> loggers;

    public Logger(String name) {
        this.name = name;
        loggers.put(name, this);
    }

    public void log(Level level, String message) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String result = String.format("[%s] %s %s - %s", level, dateFormat.format(new Date()), name, message);
        System.out.println(result);
    }

    public void log(Level level, String format, Object... args) {
        log(level, String.format(format, args));
    }

    public void debug (String message){
        log(Level.DEBUG, message);
    }

    public void debug(String format, Object... args) {
        log(Level.DEBUG, format, args);
    }

    public void info(String message){
        log(Level.INFO, message);
    }

    public void info(String format, Object... args){
        log(Level.INFO, format, args);
    }

    public void warning (String message){
        log(Level.WARNING, message);
    }

    public void warning(String format, Object... args){
        log(Level.WARNING, format, args);
    }

    public void error(String message){
        log(Level.ERROR, message);
    }

    public void error(String format, Object... args){
        log(Level.ERROR, format, args);
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public static Logger getLogger(String name){
        if(loggers.containsKey(name))
            return loggers.get(name);
        return new Logger(name);
    }

    public String getName() {
        return name;
    }
}
