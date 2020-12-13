package com.example.task01;
import java.text.SimpleDateFormat;
import java.util.*;

class Logger {

    private String name;
    public static final HashMap<String, Logger> loggers = new HashMap<>();
    private Level level;

    private enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public Logger(String name){
        this.name = name;
        loggers.put(name, this);
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public String getName(){
        return name;
    }

    public static Logger getLogger(String name){
        return Logger.loggers.getOrDefault(name, new Logger(name));
    }

    public void debug(String message){
        log(Level.DEBUG, message);
    }

    public void debug(String messageFormat, Object... args){
        log(Level.DEBUG, messageFormat, args);
    }

    public void info(String message){
        log(Level.INFO, message);
    }

    public void info(String messageFormat, Object... args){
        log(Level.INFO, messageFormat, args);
    }

    public void warning(String message){
        log(Level.WARNING, message);
    }

    public void warning(String messageFormat, Object... args){
        log(Level.WARNING, messageFormat, args);
    }

    public void error(String message){
        log(Level.ERROR, message);
    }

    public  void error(String messageFormat, Object... args){
        log(Level.ERROR, messageFormat, args);
    }

    public void log(Level level, String message){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String result = String.format("[%s] %s %s - %s", level, dateFormat.format(date), name, message);
        System.out.println(result);
    }

    public void log(Level level, String messageFormat, Object... args){
        log(level, String.format(messageFormat, args));
    }

}