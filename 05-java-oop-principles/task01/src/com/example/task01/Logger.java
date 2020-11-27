package com.example.task01;

import java.text.SimpleDateFormat;
import java.util.*;

public class Logger {

    private Logger(String name) {
        this.name = name;
    }

    String name;
    int level;
    static String[] levels = new String[] { "DEBUG", "INFO", "WARNING", "ERROR" };

    public static Logger getLogger(String name) {
        if (LoggerManager.loggerExist(name)) {
            return LoggerManager.getLogger(name);
        }
        else {
            Logger logger = new Logger(name);
            LoggerManager.loggers.put(name, logger);
            return logger;
        }
    }

    public String getName() {
        return name;
    }

    public void debug(String message) {
        if (level > 0) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.printf("[DEBUG] %s %s %s - %s%n", date, time, name, message);
    }

    public void debug(String pattern, Object... elements) {
        if (level > 0) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.printf("[DEBUG] %s %s %s - %s%n", date, time, name, String.format(pattern, elements));
    }

    public void info(String message) {
        if (level > 1) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.printf("[INFO] %s %s %s - %s%n", date, time, name, message);
    }

    public void info(String pattern, Object... elements) {
        if (level > 1) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.printf("[INFO] %s %s %s - %s%n", date, time, name, String.format(pattern, elements));
    }

    public void warning(String message) {
        if (level > 2) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.printf("[WARNING] %s %s %s - %s%n", date, time, name, message);
    }

    public void warning(String pattern, Object... elements) {
        if (level > 2) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.printf("[WARNING] %s %s %s - %s%n", date, time, name, String.format(pattern, elements));
    }

    public void error(String message) {
        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.printf("[ERROR] %s %s %s - %s%n", date, time, name, message);
    }

    public void error(String pattern, Object... elements) {
        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.printf("[ERROR] %s %s %s - %s%n", date, time, name, String.format(pattern, elements));
    }

    public void log(String level, String message) {
        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.printf("[%s] %s %s %s - %s%n", level, date, time, name, message);
    }

    public void log(String level, String pattern, Object... elements) {
        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.printf("[%s] %s %s %s - %s%n", level, date, time, name, String.format(pattern, elements));
    }

    public void setLevel(String level) {
        this.level = getLevelAsInt(level);
    }

    public String getLevel() {
        return levels[level];
    }

    private int getLevelAsInt(String level) {
        switch (level) {
            case "DEBUG":
                return 0;
            case "INFO":
                return 1;
            case "WARNING":
                return 2;
            case "ERROR":
                return 3;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static class LoggerManager {
        public static HashMap<String, Logger> loggers = new HashMap<>();

        public static Boolean loggerExist(String name) {
            return loggers.containsKey(name);
        }

        public static Logger getLogger(String name) {
            return loggers.get(name);
        }
    }
}