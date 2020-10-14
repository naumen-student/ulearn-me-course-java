package com.example.task01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

enum Level{
    DEBUG,
    INFO,
    WARNING,
    ERROR;


    @Override
    public String toString() {
        return String.format("[%s]", this.name());
    }
}

public class Logger {
    private final String name;
    private static HashMap<String, Logger> loggers = new HashMap<>();
    private Level currentLevel;

    public Logger(String name){
        this.name = name;
        this.currentLevel = Level.DEBUG;
    }

    public void setLevel(Level level){
        this.currentLevel = level;
    }

    public String getLevel(){
        return this.currentLevel.name();
    }

    public static Logger getLogger(String name){
        if (loggers.containsKey(name)){
            return loggers.get(name);
        } else{
            Logger instance = new Logger(name);
            loggers.put(name, instance);
            return instance;
        }
    }

    public String getName(){
        return this.name;
    }

    public void debug(String message){
        this.log(Level.DEBUG, message);
    }

    public void debug(String message, Object ... parameters){
        this.log(Level.DEBUG, message, parameters);
    }

    public void error(String message){
        this.log(Level.ERROR, message);
    }

    public void error(String message, Object ... parameters){
        this.log(Level.ERROR, message, parameters);
    }

    public void info(String message){
        this.log(Level.INFO, message);
    }

    public void info(String message, Object ... parameters){
        this.log(Level.INFO, message, parameters);
    }

    public void warning(String message){
        this.log(Level.WARNING, message);
    }

    public void warning(String message, Object ... parameters){
        this.log(Level.WARNING, message, parameters);
    }

    public void log(Level msgLevel, String message){
        if (msgLevel.ordinal() >= this.currentLevel.ordinal()){
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
            String newMessageFormat = "%s %s %s - %s";
            log(msgLevel, newMessageFormat, msgLevel.toString(), dtf.format(date), this.name, message);
        }
    }

    public void log(Level msgLevel, String message, Object ... parameters){
        setLevel(msgLevel);
        if (msgLevel.ordinal() >= this.currentLevel.ordinal()){
            System.out.println(String.format(message, parameters));
        }
    }
}