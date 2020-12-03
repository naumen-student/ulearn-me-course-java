package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

enum Level{
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private final String name;
    private static final HashMap<String, Logger> loggers = new HashMap<>();
    private Level level;

    private Logger(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Level getLevel(){
        return level;
    }

    public void setLevel(Level level){
        this.level = level;
    }

    public static Logger getLogger(String name){
        if (loggers.containsKey(name))
            return loggers.get(name);
        else{
            Logger log = new Logger(name);
            loggers.put(name, log);
            return log;
        }
    }

    public void log(Level level, String text){
        if (this.level.ordinal() > level.ordinal())
            return;
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        System.out.printf("[%s] %s %s - %s%n", level, dateFormat.format(date), name, text);
    }

    public void log(Level level, String template,Object... args){
        log(level, String.format(template, args));
    }

    public void debug(String message){
        log(Level.DEBUG, message);
    }

    public void debug(String template, Object... args){
        log(Level.DEBUG, template, args);
    }

    public void info(String message){
        log(Level.INFO, message);
    }

    public void info(String template, Object... args){
        log(Level.INFO, template, args);
    }

    public void warning(String message){
        log(Level.WARNING, message);
    }

    public void warning(String template, Object... args){
        log(Level.WARNING, template, args);
    }

    public void error(String message){
        log(Level.ERROR, message);
    }

    public void error(String template, Object... args){
        log(Level.ERROR, template, args);
    }
}
