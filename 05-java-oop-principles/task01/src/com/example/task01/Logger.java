package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

enum Level{
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private Level  level;
    private final String name;
    private static final Map<String, Logger> logDictionary = new HashMap<>();

    public Logger(String name){
        this.name = name;
        logDictionary.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name){
        if (logDictionary.containsKey(name))
            return logDictionary.get(name);
        Logger logger = new Logger(name);
        logDictionary.put(name, logger);
        return logger;
    }

    public void debug(String message){
        log(Level.DEBUG, message);
    }

    public void debug(String message, Object...args){
        log(Level.DEBUG, message, args);
    }

    public  void info(String message){
        log(Level.INFO, message);
    }

    public  void info(String message, Object...args){
        log(Level.INFO, message, args);
    }

    public void warning(String message){
        log(Level.WARNING, message);
    }

    public void warning(String message, Object...args){
        log(Level.WARNING, message, args);
    }

    public  void error(String message){
        log(Level.ERROR, message);
    }

    public  void error(String message, Object...args){
        log(Level.ERROR, message, args);
    }

    public void log(Level level, String message){
        if(this.level != null && this.level.ordinal() > level.ordinal())
            return;
        Date dateBase = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.d");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
        System.out.printf("[%s] %s %s %s - %s", level, date.format(dateBase),
                time.format(dateBase), this.name, message);
    }

    public void log(Level level, String message, Object...args){
        log(level, String.format(message, args));
    }

    public void setLevel(Level level){
        this.level = level;
    }

    public Level getLevel(){
        return level;
    }
}
