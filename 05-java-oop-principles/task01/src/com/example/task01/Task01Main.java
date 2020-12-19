package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Logger {

    enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }
    private static HashMap<String, Logger> M = new HashMap<>();
    private Level lvl;
    private String name, msg;
    private Logger(String name) {
        this.name = name;
        M.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if(M.containsKey(name)){
            return M.get(name);
        }
        else{
            return new Logger(name);
        }
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String message, Object ... args) {
        log(Level.DEBUG, message, args);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String message, Object ... args) {
        log(Level.INFO, message, args);
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String message, Object ... args) {
        log(Level.WARNING, message, args);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String message, Object ... args) {
        log(Level.ERROR, message, args);
    }

    private void log(Level lvl, String message) {
        msg = message;
        this.lvl = lvl;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        if (lvl.compareTo(lvl) >= 0) {
            System.out.printf("[%s] %s %s - %s", this.lvl, dateFormat.format(new Date()), this.name, message);
        }
    }

    private void log(Level lvl, String message, Object ... args) {
        log(lvl, String.format(message, args));
    }

    public final void setLevel(Level lvl) {
        this.lvl = lvl;
    }

    public final Level getLevel() {
        return this.lvl;
    }

}
