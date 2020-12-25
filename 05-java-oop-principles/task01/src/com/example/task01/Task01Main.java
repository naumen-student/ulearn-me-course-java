package com.example.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Date;


class Logger{

    final String name;
    private Level level;
    private static HashMap<String,Logger> measurements;

    private enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public Logger(String name) {
        level = Level.DEBUG;
        this.name = name;
        measurements.put(name,this);
    }

    public String getName() {
        return this.name;
    }

    public static Logger getLogger(String name){
        if(measurements.containsKey(name))
            return measurements.get(name);
        return new Logger(name);
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return this.level;
    }

    public void log(Level level, String message) {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy.mm.dd hh:MM:ss");
        String result = String.format("[%s] %s %s - %s", level, format.format(date), name, message);
        System.out.println(result);
    }
    public void log(Level level, String mTemplate, Object... args) {
        log(level, String.format(mTemplate, args));
    }

    public void debug (String message){
        log(Level.DEBUG, message);
    }

    public void debug(String mTemplate, Object... args) {
        log(Level.DEBUG, mTemplate, args);
    }

    public void info(String message){
        log(Level.INFO, message);
    }

    public void info(String mTemplate, Object... args){
        log(Level.INFO, mTemplate, args);
    }

    public void warning (String message){
        log(Level.WARNING, message);
    }

    public void warning(String mTemplate, Object... args){
        log(Level.WARNING, mTemplate, args);
    }

    public void error(String message){
        log(Level.ERROR, message);
    }

    public void error(String mTemplate, Object... args){
        log(Level.ERROR, mTemplate, args);
    }

}

