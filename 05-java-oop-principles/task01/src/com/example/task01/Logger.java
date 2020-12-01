package com.example.task01;
import java.text.*;
import java.util.*;

public class Logger{
    private String name;

    public Logger(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public enum levels {
        DEBUG,
        INFO,
        WARNING,
        ERROR}
    private levels level = levels.ERROR;

    private static List <Logger> logs = new ArrayList();

    public void log(levels level, String mes) {
        Date now = new Date();
        SimpleDateFormat format_date = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String to_out = String.format("[%s] %s %s - %s" ,level,format_date.format(now),name,mes);
        System.out.println(to_out);
    }

    public void log(levels level, String type, Object... mes){
        if (level.ordinal() > this.level.ordinal()){
            log(level, String.format(type, mes));
        }
    }

    public static Logger getLogger(String name){

        boolean flag = false;
        Logger log = null;

        for (Logger lg: logs){
            if (lg.getName()==name){
                log = lg;
                flag = true;
                break;
            }
        }
        if (!flag) {
            log = new Logger(name);
            logs.add(log);
        }
        return log;
    }

    public void debug(String mes){
        log(level.DEBUG, mes);
    }
    public void debug(String type, Object... mes){
        log(level.DEBUG,type, mes);
    }

    public void info(String mes){
        log(level.INFO, mes);
    }
    public void info(String type, Object... mes){
        log(level.INFO,type, mes);
    }

    public void warning(String mes){
        log(level.WARNING, mes);
    }
    public void warning(String type, Object... mes){
        log(level.WARNING,type, mes);
    }

    public void error(String mes){
        log(level.ERROR, mes);
    }
    public void error(String type, Object... mes){
        log(level.ERROR,type, mes);
    }


    public void setLevel(levels level){
        this.level = level;
    }

    public levels getLevel(){
        return level;
    }


}