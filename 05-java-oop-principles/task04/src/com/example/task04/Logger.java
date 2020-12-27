package com.example.task04;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.String.format;

enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR;


    @Override
    public String toString() {
        return String.format("[%s]", this.name());
    }
}

public class Logger {
    private final String name;
    private static final HashMap<String, Logger> loggers = new HashMap<>();
    private Level lvl;
    private ArrayList<MessageHandler> handlers;

    private Logger(String name) {
        this.name = name;
        this.lvl = Level.DEBUG;
        handlers = new ArrayList<>();
    }

    public String getLevel() {
        return lvl.name();
    }

    public void setLevel(Level level) {
        lvl = level;
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (loggers.containsKey(name))
            return loggers.get(name);
        return new Logger(name);
    }

    public void addHandler (MessageHandler handler) {
        this.handlers.add(handler);
    }

    public void log(Level levels, String message) {
        if (levels.ordinal() >= lvl.ordinal()) {
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
            String newMesFormat = "%s %s %s - $s";
            this.log(levels, newMesFormat, levels.toString(), dtf.format(date), this.name, message);
        }
    }

    public void log(Level levels, String message, Object... args) {
        setLevel(levels);
        if (levels.ordinal() >= lvl.ordinal()) {
            for (MessageHandler handler : this.handlers) {
                try {
                    handler.handleMessage(String.format(message, args));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void debug(String mes) {
        log(Level.DEBUG, mes);
    }

    public void debug(String mes, Object... args) {
        log(Level.DEBUG, mes, args);
    }

    public void info(String mes) {
        log(Level.INFO, mes);
    }

    public void info(String mes, Object... args) {
        log(Level.INFO, mes, args);
    }

    public void warning(String mes) {
        log(Level.WARNING, mes);
    }

    public void warning(String mes, Object... args) {
        log(Level.WARNING, mes, args);
    }

    public void error(String mes) {
        log(Level.ERROR, mes);
    }

    public void error(String mes, Object... args) {
        log(Level.ERROR, mes, args);
    }
}