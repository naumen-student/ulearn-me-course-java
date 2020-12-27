package com.example.task04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Logger{
    private static final Map<String, Logger> loggers = new HashMap<String, Logger>();
    private final String name;
    private Level level;

    private Logger(String name){
        this.name = name;
    }

    public static Logger getLogger(String name){
        if (!loggers.containsKey(name) )
            loggers.put(name, new Logger(name));
        return loggers.get(name);
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

    public void debug(String message){
        makeLog(Level.DEBUG, message);
    }

    public void debug(String template, Object... args){
        makeLog(Level.DEBUG, template, args);
    }

    public void info(String message){
        makeLog(Level.INFO, message);
    }

    public void info(String template, Object... args){
        makeLog(Level.INFO, template, args);
    }

    public void warning(String message){
        makeLog(Level.WARNING, message);
    }

    public void warning(String template, Object... args){
        makeLog(Level.WARNING, template, args);
    }

    public void error(String message){
        makeLog(Level.ERROR, message);
    }

    public void error(String template, Object... args){
        makeLog(Level.ERROR, template, args);
    }

    private void makeLog(Level level, String message){
        if (level != null && this.level != null && level.ordinal() < this.level.ordinal())
            return;
        DateFormat format = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String logResponse = String.format(
                "[%s] %s %s - %s",
                level,
                format.format(new Date()),
                name, message
        );
        System.out.println(logResponse);
    }

    private void makeLog(Level level, String template, Object... args){
        makeLog(level, String.format(template, args));
    }
}