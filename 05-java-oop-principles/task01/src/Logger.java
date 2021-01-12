package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import java.text.DateFormat;

public class Logger {

    private final String name;
    private Level level;

    private Logger(String name){
        this.name = name;
        loggerDict.put(name, this);
    }

    public String getName(){
        return name;
    }

    private static final HashMap<String, Logger> loggerDict = new HashMap<>();

    public static Logger getLogger(String name){
        if (loggerDict.containsKey(name)){
            return loggerDict.get(name);
        }
        else {
            return new Logger(name);
        }
    }

    enum Level{
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }
    public Level getLevel(){
        return level;
    }

    public void setLevel(Level level){
        this.level = level;
    }

    public void debug(String message){
        log(Level.DEBUG, message);
    }

    public void debug(String message, Object... args){
        log(Level.DEBUG, message, args);
    }

    public void info(String message){
        log(Level.INFO, message);
    }

    public void info(String message, Object... args){
        log(Level.INFO, message, args);
    }

    public void warning(String message){
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

    private String log(Level level, String message){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        return String.format("[%d] %d %d",level, dateFormat.format(new Date()), name, message);
    }

    private void log(Level level, String message, Object... args) {
        log(level, String.format(message, args));
    }

}