package com.example.task01;

import java.text.DateFormat;
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

public class Logger{
    private static final Map<String, Logger> loggers = new HashMap<String, Logger>();
    private final String name;
    private Level level;

    public static Logger getLogger(String name){
        if ( loggers.containsKey(name) )
            return loggers.get(name);
        else {
            Logger logger = new Logger(name);
            loggers.put(name, logger);
            return logger;
        }
    }

    public Logger(String name){
        this.name = name;
    }

    public void debug(String message){
        log(Level.DEBUG, message);
    }

    public void debug(String template, Object... messageArgs){
        log(Level.DEBUG, template, messageArgs);
    }

    public void info(String message){
        log(Level.INFO, message);
    }

    public void info(String template, Object... messageArgs){
        log(Level.INFO, template, messageArgs);
    }

    public void warning(String message){
        log(Level.WARNING, message);
    }

    public void warning(String template, Object... messageArgs){
        log(Level.WARNING, template, messageArgs);
    }

    public void error(String message){
        log(Level.ERROR, message);
    }

    public void error(String template, Object... messageArgs){
        log(Level.ERROR, template, messageArgs);
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level.ordinal();
    }

    public void setLevel(Level level){
        this.level = level;
    }

    public void log(Level level, String message){
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy.mm.dd hh:MM:ss");
        String result = String.format("[%s] %s %s - %s", level, format.format(date), name, message);
        System.out.println(result);
    }

    public void log(Level level, String template, Object... messageArgs){
        log(level, String.format(template, messageArgs));
    }
}
