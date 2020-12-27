package com.example.task04;

import java.util.ArrayList;
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
    private final ArrayList<MessageHandler> messageHandlers;

    public Logger(String name) {
        this.name = name;
        loggers.put(name, this);
        messageHandlers = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public static Logger getLogger(String name){
        return loggers.containsKey(name) ? loggers.get(name) : new Logger(name);
    }

    public void log(Level severityLevel, String message){
        for(MessageHandler messageHandler:messageHandlers){
            if (messageHandler.getClass() != ConsoleHandler.class || level.ordinal() <= severityLevel.ordinal()){
                messageHandler.log(severityLevel, message);
            }
        }
    }

    public void log(Level severityLevel, String template, Object... args) {
        log(severityLevel, String.format(template, args));
    }

    public void error(String message){
        log(Level.ERROR, message);
    }

    public void error(String template, Object ... args){
        log(Level.ERROR, template, args);
    }

    public void debug(String message){
        log(Level.DEBUG, message);
    }

    public void debug(String template, Object ... args){
        log(Level.DEBUG, template, args);
    }

    public void info(String message){
        log(Level.INFO, message);
    }

    public void info(String template, Object ... args){
        log(Level.INFO, template, args);
    }

    public void warning(String message){
        log(Level.WARNING, message);
    }

    public void warning(String template, Object ... args){
        log(Level.WARNING, template, args);
    }

    public void setLevel(Level level){
        this.level = level;
    }

    public Level getLevel(){
        return level;
    }

    public void addMessageHandler(MessageHandler handler){
        messageHandlers.add(handler);
    }
}
