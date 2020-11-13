package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.*;

public class Logger {
    private final String logName;
    private Level level;
    private static final Hashtable<String, Logger> logList = new Hashtable();

    public Logger(String name) {
        logName = name;
        level = Level.DEBUG;
        logList.put(name, this);
    }

    public static Logger getLogger(String name) {
        if (!logList.containsKey(name))
            logList.put(name, new Logger(name));
        return logList.get(name);
    }

    public void debug(String message){
        log(Level.DEBUG, message);
    }

    public void debug(String message, Object... args) {
        log(Level.DEBUG, message, args);
    }

    public void info(String message){
        log(Level.INFO, message);
    }

    public void info(String message, Object... args){
        log(Level.INFO, message, args);
    }

    public void warning (String message){
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

    public void log(Level level, String message) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String result = String.format("[%s] %s %s - %s", level, formatForDateNow.format(dateNow), logName, message);
        System.out.println(result);
    }

    public void log(Level level, String message, Object... args) {
        log(level, String.format(message, args));
    }

    public String getName() {
        return logName;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel(){
        return level;
    }
}
