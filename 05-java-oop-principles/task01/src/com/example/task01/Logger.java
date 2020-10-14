package com.example.task01;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import static java.text.MessageFormat.*;

public class Logger {
    private enum levels {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }
    private static final HashMap<String, Logger> loggerMap = new HashMap<>();
    private final String name;
    private levels level = null;
    public Logger(String name) {
        this.name = name;
        loggerMap.put(name, this);
    }

    public String getName(){
        return name;
    }

    public void setLevel(String level){
        this.level = levels.valueOf(level);
    }

    public String getLevel(){
        return level.name();
    }

    public static Logger getLogger(String name){
        return loggerMap.containsKey(name) ? loggerMap.get(name) : new Logger(name);
    }

    public void log(levels level, String message) {
        if (level.ordinal() < this.level.ordinal()) return;
        String currentDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
        System.out.println(format("[{0}] {1} {2} - {3}", level, currentDateTime, name, message));
    }

    public void log(levels level, String format, Object... args) {
        log(level, String.format(format, args));
    }

    public void debug(String message){
        log(levels.DEBUG, message);
    }

    public void debug(String format, Object... args){
        log(levels.DEBUG, format, args);
    }

    public void info(String message){
        log(levels.INFO, message);
    }

    public void info(String format, Object... args){
        log(levels.INFO, format, args);
    }

    public void warning(String message){
        log(levels.WARNING, message);
    }

    public void warning(String format, Object... args){
        log(levels.WARNING, format, args);
    }

    public void error(String message){
        log(levels.ERROR, message);
    }

    public void error(String format, Object... args){
        log(levels.ERROR, format, args);
    }
}
