package com.example.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

enum Level{
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {

    private final String name;
    private static Logger logger = null;
    private Level loggerLevel = Level.DEBUG;

    public Logger(String name){
        this.name = name;
        logger = this;
    }

    public String getName(){
        return name;
    }

    public static Logger getLogger(String name){
        if(logger == null)
            return new Logger(name);
        else return logger;
    }

    public void debug(String message){
        log(Level.DEBUG, message);
    }

    public void debug(String format, Object... args){
        log(Level.DEBUG, format, args);
    }

    public void info(String message){
        log(Level.INFO, message);
    }

    public void info(String format, Object... args){
        log(Level.INFO, format, args);
    }

    public void warning(String message){
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

    private void log(Level level, String message){
        if (level.compareTo(loggerLevel) < 0)
            return;
        DateFormat format = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        System.out.printf("[%s] %s %s - %s%n", level,format.format(new Date()), name, message);
    }

    private void log(Level level, String format, Object... args){
        log(level, String.format(format,args));
    }

    public void setLevel(Level level) {
        loggerLevel = level;
    }

    public Level getLevel(){
        return loggerLevel;
    }
}
