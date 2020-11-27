package com.example.task04;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Logger {

    private Logger(String name, MessageHandler... messageHandlers) {
        this.name = name;
        this.messageHandlers = messageHandlers;
    }

    private final String name;
    private int level;
    private static final String[] levels = new String[] { "DEBUG", "INFO", "WARNING", "ERROR" };
    private final MessageHandler[] messageHandlers;

    public static Logger getLogger(String name, MessageHandler messageHandler) {
        if (LoggerManager.loggerExist(name)) {
            return LoggerManager.getLogger(name);
        }
        else {
            Logger logger = new Logger(name, messageHandler);
            LoggerManager.loggers.put(name, logger);
            return logger;
        }
    }

    public String getName() {
        return name;
    }

    public void debug(String message) throws IOException {
        if (level > 0) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        for (MessageHandler mh: messageHandlers) {
            mh.handleLog(String.format("[DEBUG] %s %s %s - %s%n", date, time, name, message));
        }
    }

    public void debug(String pattern, Object... elements) throws IOException {
        if (level > 0) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        for (MessageHandler mh: messageHandlers) {
            mh.handleLog(String.format("[INFO] %s %s %s - %s%n", date, time, name, String.format(pattern, elements)));
        }
    }

    public void info(String message) throws IOException {
        if (level > 1) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        for (MessageHandler mh: messageHandlers) {
            mh.handleLog(String.format("[DEBUG] %s %s %s - %s%n", date, time, name, message));
        }
    }

    public void info(String pattern, Object... elements) throws IOException {
        if (level > 1) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        for (MessageHandler mh: messageHandlers) {
            mh.handleLog(String.format("[INFO] %s %s %s - %s%n", date, time, name, String.format(pattern, elements)));
        }
    }

    public void warning(String message) throws IOException {
        if (level > 2) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        for (MessageHandler mh: messageHandlers) {
            mh.handleLog(String.format("[DEBUG] %s %s %s - %s%n", date, time, name, message));
        }
    }

    public void warning(String pattern, Object... elements) throws IOException {
        if (level > 2) {
            return;
        }

        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        for (MessageHandler mh: messageHandlers) {
            mh.handleLog(String.format("[INFO] %s %s %s - %s%n", date, time, name, String.format(pattern, elements)));
        }
    }

    public void error(String message) throws IOException {
        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        for (MessageHandler mh: messageHandlers) {
            mh.handleLog(String.format("[DEBUG] %s %s %s - %s%n", date, time, name, message));
        }
    }

    public void error(String pattern, Object... elements) throws IOException {
        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        for (MessageHandler mh: messageHandlers) {
            mh.handleLog(String.format("[INFO] %s %s %s - %s%n", date, time, name, String.format(pattern, elements)));
        }
    }

    public void log(String level, String message) throws IOException {
        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        for (MessageHandler mh: messageHandlers) {
            mh.handleLog(String.format("[%s] %s %s %s - %s%n", level, date, time, name, message));
        }
    }

    public void log(String level, String pattern, Object... elements) throws IOException {
        String date = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

        for (MessageHandler mh: messageHandlers) {
            mh.handleLog(String.format("[%s] %s %s %s - %s%n", level, date, time, name, String.format(pattern, elements)));
        }
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

    private static class LoggerManager {
        public static HashMap<String, Logger> loggers = new HashMap<>();

        public static Boolean loggerExist(String name) {
            return loggers.containsKey(name);
        }

        public static Logger getLogger(String name) {
            return loggers.get(name);
        }
    }
}