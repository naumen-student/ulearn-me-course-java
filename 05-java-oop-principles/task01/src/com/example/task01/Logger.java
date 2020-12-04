package com.example.task01;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Logger {
    private final String name;
    private static final ArrayList<String> levels = new ArrayList<>(
            Arrays.asList(
                    "DEBUG",
                    "INFO",
                    "WARNING",
                    "ERROR"));

    private String level;
    private static final ArrayList<Logger> copies = new ArrayList<>();

    private Logger(String name) {
        this.name = name;
        copies.add(this);
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name){
        for(Logger logger: copies) {
            if(logger.name.equals(name)) {
                return logger;
            }
        }

        return new Logger(name);
    }

    public void setLevel(String level) {
        if (levels.contains(level)) {
            this.level = level;
            return;
        }

        throw new ValueException(String.format("Level %s doesn't exist!", level));
    }

    public String getLevel() {
        return level;
    }

    public void debug(String message) {
        log("DEBUG", message);
    }

    public void debug(String format, Object... args){
        log("DEBUG", format, args);
    }

    public void info(String message) {
        log("INFO", message);
    }

    public void info(String format, Object... args) {
        log("INFO", format, args);
    }

    public void warning(String message) {
        log("WARNING", message);
    }

    public void warning(String format, Object... args) {
        log("WARNING", format, args);
    }

    public void error(String message) {
        log("ERROR", message);
    }

    public void error(String format, Object... args) {
        log("ERROR", format, args);
    }

    private void log(String level, String format, Object... args){
        log(level, String.format(format, args));
    }

    private void log(String level, String message) {
        if(levels.indexOf(level) >= levels.indexOf(this.level)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.printf("[%s] %s %s - %s%n", level, dtf.format(now), name, message);
        }
    }
}