package com.example.task01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

public class Logger {

    private String name;
    private static Map<String, Logger> hm = new HashMap<String, Logger>();
    private enum level{
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }
    private level priorityLevel;

    public Logger(String name){
        this.name = name;
    }

    public static Logger getLogger(String name){
        Logger lg;
        if(hm.containsKey(name)){
            lg = hm.get(name);
        }
        else{
            lg = new Logger(name);
            hm.put(name, lg);
        }
        return lg;
    }

    private String getName(){
        return name;
    }

    private void setLevel(level lvl){
        this.priorityLevel = lvl;
    }

    private level getLevel(){
        return this.priorityLevel;
    }

      public void debug(String message) {
        log(level.DEBUG, message);
    }

    public void debug(String message, Object... args) {
        log(level.DEBUG, message, args);
    }

    public void info(String message) {
        log(level.INFO, message);
    }

    public void info(String message, Object... args) {
        log(level.INFO, message, args);
    }

    public void warning(String message) {
        log(level.WARNING, message);
    }

    public void warning(String message, Object... args) {
        log(level.WARNING, message, args);
    }

    public void error(String message) {
        log(level.ERROR, message);
    }

    public void error(String message, Object... args) {
        log(level.ERROR, message, args);
    }

    private void log(level lvl, String msg){
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
        System.out.println(String.format("[%a], %b %c - %d", lvl, format.format(date), name, msg));
    }

    private void log(level lvl, String msg, Object... args) {
        log(lvl, String.format(msg, args));
    }
}
