package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.Date;

public class Logger {
    public String logName;
    public static final Hashtable<String, Logger> loggers = new Hashtable<String, Logger>();
    public LogLevels level;

    public Logger(String name) {
        logName = name;
        level = LogLevels.DEBUG;
        loggers.put(name, this);
    }

    public String getName() {
        return logName;
    }

    public static Logger getLogger(String name) {
        return new Logger(name);
    }

    public enum LogLevels {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public void log(LogLevels level, String message) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String result = String.format("[%s] %s %s - %s", level, dateFormat.format(date), logName, message);
        System.out.println(result);
    }

    public void log(LogLevels level, String message, Object... args) {
        log(level, String.format(message, args));
    }

    public void debug(String message){
        log(LogLevels.DEBUG, message);
    }

    public void debug(String message, Object... args) {
        log(LogLevels.DEBUG, message, args);
    }

    public void info(String message) {
        log(LogLevels.INFO, message);
    }

    public void info(String message, Object... args) {
        log(LogLevels.INFO, message, args);
    }

    public void warning(String message) {
        log(LogLevels.WARNING, message);
    }

    public void warning(String message, Object... args) {
        log(LogLevels.WARNING, message, args);
    }

    public void error(String message) {
        log(LogLevels.ERROR, message);
    }

    public void error(String message, Object... args) {
        log(LogLevels.ERROR, message, args);
    }

    public void setLevel(LogLevels level) {
        this.level = level;
    }

    public LogLevels getLevel() {
        return level;
    }
}
/**package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.util.Date;

public class Logger {
    private String name;
    private Level level;
    private static final Hashtable<String, Logger> logList = new Hashtable<String, Logger>();

    public Logger(String name) {
        return logList.getOrDefault(name, new Logger(name));
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

    public enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
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
}*/
