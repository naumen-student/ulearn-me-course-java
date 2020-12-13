package com.example.task04;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Logger {
    private String name;
    private static final HashMap<String, Logger> logger = new HashMap<String, Logger>();
    private Level level;
    private Date Date;
    private Time Time;
    private String Message;

    enum Level {
        ERROR,
        WARNING,
        INFO,
        DEBUG
    }

    public Logger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (logger.containsKey(name)) {
            return logger.get(name);
        } else {
            Logger logger = new Logger(name);
            Logger.logger.put(name, logger);
            return logger;
        }

    }

    public void setLevel(Level level){
        this.level = level;
    }

    public Level getLevel(){
        return this.level;
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

    private void log(Level level, String message, Object... args) {
        log(level, String.format(message, args));
    }

    private void log(Level level, String message) {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy.mm.dd hh:MM:ss");
        System.out.println(String.format("[%a], %b %c - %d", level, format.format(date), name, message));
    }
}