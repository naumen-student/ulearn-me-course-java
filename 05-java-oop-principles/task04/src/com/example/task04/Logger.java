package com.example.task04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Logger {

    private final String name;
    public static final HashMap<String, Logger> loggers = new HashMap<>();
    private Level level;
    private List<MessageHandler> handlers = new ArrayList<>();

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

    public void log(Level level, String message) {
        if (level.ordinal() > this.level.ordinal()) {
            String.format("[%s] %t %s - %s",
                    level,
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                    this.name,
                    message);
        }
        else return;
    }

    public void log(Level level, String messageFormat, Object... args){
        log(level, String.format(messageFormat, args));
    }

}