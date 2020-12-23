package com.example.task01;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

enum Level{
    DEBUG,
    INFO,
    WARNING,
    ERROR
}


class Logger{
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

    public void debug(String message){
        if(getLevel() == Level.DEBUG) {
            System.out.println(log(Level.DEBUG, message));
        }
    }

    public String debug(String format, Object... args){
        return String.format(format, args);
    }

    public void info(String message){
        if(getLevel() == Level.INFO) {
            System.out.println(log(Level.INFO, message));
        }
    }

    public String info(String format, Object... args){
        return String.format(format, args);
    }

    public void warning(String message){
        if(getLevel() == Level.WARNING) {
            System.out.println(log(Level.WARNING, message));
        }
    }

    public String warning(String format, Object... args){
        return String.format(format, args);
    }

    public void error(String message){
        System.out.println(log(Level.ERROR, message));
    }

    public void error(String format, Object... args){
        String.format(format, args);
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
        return new Logger(name);
    }
}




public class Task01Main {
    public static void main(String[] args) {
        Logger log = new Logger("test");
        System.out.println(String.format(" [%s]", "fdf" ));
    }
}