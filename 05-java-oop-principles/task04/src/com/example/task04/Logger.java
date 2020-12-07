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

    public void log(Level level, String msg) {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy.mm.dd hh:MM:ss");
        String result = String.format("[%s] %s %s - %s", level, format.format(date), name, msg);
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

    public void log(Level logLevel, String msg, Object... args) {
        log(logLevel, String.format(msg, args));
    }

    public void debug(String msg){
        log(Level.DEBUG, msg);
    }

    public void debug(String msg, Object... args) {
        log(Level.DEBUG, msg, args);
    }

    public void info(String msg){
        log(Level.INFO, msg);
    }

    public void info(String msg, Object... args){
        log(Level.INFO, msg, args);
    }

    public void warning (String msg){
        log(Level.WARNING, msg);
    }

    public void warning(String msg, Object... args){
        log(Level.WARNING, msg, args);
    }

    public void error(String msg){
        log(Level.ERROR, msg);
    }

    public void error(String msg, Object... args){
        log(Level.ERROR, msg, args);
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