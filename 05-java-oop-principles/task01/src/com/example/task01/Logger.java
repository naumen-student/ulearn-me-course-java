package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

enum Level{
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

public class Logger {
    private static final Map<String, Logger> _loggersStore = new HashMap<String, Logger>();
    private final String _name;
    private Level _lv;

    public Logger(String name) {
        _name = name;
    }

    public void setLevel(Level lv){
        _lv = lv;
    }

    public int getLevel(){
        return _lv.ordinal();
    }

    public String getName(){
        return _name;
    }

    public static Logger getLogger(String name){
        if(_loggersStore.containsKey(name)) return  _loggersStore.get(name);
        Logger logger = new Logger(name);
        _loggersStore.put(name, logger);
        return logger;
    }

    public void log(Level lv, String text){
        Date date = new Date();
        SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        System.out.printf("[%s] %s %s - %s%n", lv, dateFormater.format(date), _name, text);
    }

    public void log(Level lv, String template,Object... args){
        log(lv, String.format(template, args));
    }

    public void debug(String text){
        log(Level.DEBUG, text);
    }

    public void debug(String template, Object... args){
        log(Level.DEBUG, template, args);
    }

    public void info(String text){
        log(Level.INFO, text);
    }

    public void info(String template, Object... args){
        log(Level.INFO, template, args);
    }

    public void warning(String text){
        log(Level.WARNING, text);
    }

    public void warning(String template, Object... args){
        log(Level.WARNING, template, args);
    }

    public void error(String text){
        log(Level.ERROR, text);
    }

    public void error(String template, Object... args){
        log(Level.ERROR, template, args);
    }
}
