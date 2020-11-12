package com.example.task04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

import static java.text.MessageFormat.*;

public class AdvancedLogger {
    private static final HashMap<String, AdvancedLogger> loggerMap = new HashMap<>();
    private final ArrayList<MessageHandler> handlers = new ArrayList<>();

    private final String name;
    private levels level = null;

    public AdvancedLogger(String name) {
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

    public static AdvancedLogger getLogger(String name){
        return loggerMap.containsKey(name) ? loggerMap.get(name) : new AdvancedLogger(name);
    }

    public void addMessageHandler(MessageHandler handler){
        handlers.add(handler);
    }

    public void removeMessageHandler(MessageHandler handler){
        handlers.remove(handler);
    }

    public void log(levels level, String message) {
        if (level.ordinal() < this.level.ordinal()) return;
        String currentDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
        String logMessage = format("[{0}] {1} {2} - {3}", level, currentDateTime, name, message);
        for(MessageHandler handler : handlers) {
            handler.handle(logMessage);
        }
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

    private enum levels {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }
}
