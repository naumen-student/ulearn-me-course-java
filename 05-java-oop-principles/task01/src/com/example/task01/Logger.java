package com.example.task01;

import static java.text.MessageFormat.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Logger {

    private enum levels {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private levels Level;
    private String Name;
    private static final ArrayList<Logger> arrayLogger = new ArrayList<>();

    public void setLevel(String level){
        this.Level = levels.valueOf(level);
    }

    public String getLevel(){
        return Level.name();
    }

    public String getName(){
        return Name;
    }

    private Logger(String name) {
        this.Name = name;
        arrayLogger.add(this);
    }

    public static Logger getLogger(String name){
        for(Logger logger: arrayLogger) {
            if(logger.Name.equals(name)) {
                return logger;
            }
        }
        return new Logger(name);
    }

    public void log(levels level, String message) {
        if (this.Level.ordinal() > level.ordinal()) return;
        String currentDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.mm.dd hh:mm:ss"));
        System.out.println(format("[{0}] {1} {2} - {3}", level, currentDateTime, Name, message));
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