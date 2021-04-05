package com.example.task04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Logger {
    private final String name;
    private  Level level;
    private static final HashMap<String , Logger> loggers = new HashMap<>();

    public Logger(String name){
        this.name = name;
        loggers.put(name,this);
    }
    public String getName(){
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level){
        this.level = level;
    }

    public static Logger getLogger(String name){
        if(loggers.containsKey(name))
            return loggers.get(name);
        else
            return new Logger(name);
    }

    enum Level{
        DEBUG,
        INFO,
        WARNING,
        ERROR
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

    public String log(Level level, String message){
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        return String.format("[%s] %d %s %s",level, dateFormat.format(new Date()), name, message);
    }
    public String log(Level level, String message, Object... args){
        return log(level, String.format(message, args));
    }
}