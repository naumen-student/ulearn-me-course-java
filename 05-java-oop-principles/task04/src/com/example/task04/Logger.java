package com.example.task04;

import java.time.LocalDate;
import java.time.LocalTime;

enum Level{
    DEBUG,
    INFO,
    WARNING,
    ERROR
}


public class Logger{
    private String Name;
    private Level level;

    public Logger(String name){
        Name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void debug(String message, MessageHandler handler){
        if(getLevel() == Level.DEBUG) {
            handler.outMessage(log(Level.DEBUG, message));
        }
    }

    public String debug(String format, Object... args){
        return  log(Level.DEBUG, format, args);
    }

    public void info(String message, MessageHandler handler){
        if(getLevel() == Level.INFO) {
            handler.outMessage(log(Level.INFO, message));
        }
    }

    public String info(String format, Object... args){
        return  log(Level.INFO, format, args);
    }

    public void warning(String message, MessageHandler handler){
        if(getLevel() == Level.WARNING) {
            handler.outMessage(log(Level.WARNING, message));
        }
    }

    public String warning(String format, Object... args){
        return  log(Level.WARNING, format, args);
    }

    public void error(String message, MessageHandler handler){
        if(getLevel() == Level.ERROR) {
            handler.outMessage(log(Level.ERROR, message));
        }
    }

    public String error(String format, Object... args){
        return  log(Level.ERROR, format, args);
    }

    public String log(Level level, String message){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        return String.format(" [%s] %d.%d.%d %d:%d:%d %s - %s", level.name(), date.getYear(), date.getMonthValue(),
                date.getDayOfMonth(),time.getHour(), time.getMinute(), time.getSecond(), this.Name, message);
    }



    public String log(Level level, String format, Object... args){
        return String.format(format, level.name(), args);
    }

    public String getName() {
        return Name;
    }

    public static Logger getLogger(String name){
        return  new Logger(name);
    }
}
