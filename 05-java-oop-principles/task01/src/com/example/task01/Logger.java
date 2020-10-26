package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Logger {
    private String name;
    private Level  level;
    private static Map<String, Logger> loggerMap = new HashMap<>();

    public Logger(String name) {
        this.name = name;
        loggerMap.put(name, this);
    }

    public String getName() { return name; }

    public void setLevel(Level level){this.level = level;}

    public Level getLevel() {return this.level;}

    public static Logger getLogger(String name) {
        if (loggerMap.containsKey(name)) return loggerMap.get(name);
        return new Logger(name);
    }

    public void debug(String message){ log(Level.DEBUG,message); }

    public void debug(String message, Object...args){ log(Level.DEBUG,message,args); }

    public void info(String message){ log(Level.INFO,message); }

    public void info(String message, Object...args){ log(Level.INFO,message,args); }

    public void warning(String message){ log(Level.WARNING,message); }

    public void warning(String message, Object...args){ log(Level.WARNING,message,args); }

    public void error(String message){ log(Level.ERROR,message); }

    public void error(String message, Object...args){ log(Level.ERROR,message,args); }

    public void log(Level level, String message) {
        System.out.printf("[%s] %s %s - %s", level,
                new SimpleDateFormat("yyyy.MM.d hh:mm:ss").format(new Date()), this.name, message);
    }

    public void log(Level level, String message, Object...args){
        log(level, String.format(message, args));
    }

}
