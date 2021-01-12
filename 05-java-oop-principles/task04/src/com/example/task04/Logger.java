package com.example.task04;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Logger{
    private final String name;
    private Level logLevel;
    private static HashMap<String, Logger> logHistory = new HashMap<>();

    private enum Level{
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public void log(Level level, String message) {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy.mm.dd hh:MM:ss");
        String result = String.format("[%s] %s %s - %s", level, format.format(date), name, message);
        System.out.println(result);
    }

    public String getName() {
        return this.name;
    }

    public void setLevel(Level logLevel) {
        this.logLevel = logLevel;
    }

    public Level getLevel() {
        return this.logLevel;
    }

    public void log(Level logLevel, String message, Object... args) {
        log(logLevel, String.format(message, args));
    }

    public void debug(String message){
        log(Level.DEBUG, message);
    }

    public void debug(String message, Object... args) {
        log(Level.DEBUG, message, args);
    }

    public void info(String message){
        log(Level.INFO, message);
    }

    public void info(String message, Object... args){
        log(Level.INFO, message, args);
    }

    public void warning (String message){
        log(Level.WARNING, message);
    }

    public void warning(String message, Object... args){
        log(Level.WARNING, message, args);
    }

    public void error(String message){
        log(Level.ERROR, message);
    }

    public void error(String message, Object... args){
        log(Level.ERROR, message, args);
    }

    public Logger(String name){
        this.name = name;
        this.logLevel = Level.DEBUG;
        logHistory.put(name, this);
    }

    public static Logger getLogger(String name){
        if(logHistory.containsKey(name))
            return logHistory.get(name);
        return new Logger(name);
    }
}