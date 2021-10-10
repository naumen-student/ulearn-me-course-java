package com.example.task01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

public class Task01Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger("myLogger");
        logger1.setLevel("DEBUG");
        logger1.warning("%s %f", "Angle", 90f);
        logger1.debug("Test message");
    }
}

class Logger {
    private static final ArrayList<Logger> Loggers = new ArrayList<>();

    public static Logger getLogger(String name) {
        Logger tempLogger = new Logger(name);
        if (!Loggers.contains(tempLogger)) {
            Loggers.add(tempLogger);
            return tempLogger;
        } else
            return Loggers.get(Loggers.indexOf(tempLogger));
    }

    private final String NAME;
    private String LEVEL = "DEBUG";

    public Logger(String name) {
        NAME = name;
    }

    public void setLevel(String level) {
        this.LEVEL = level;
    }

    public String getLevel() {
        return LEVEL;
    }

    public String getName() {
        return NAME;
    }

    public void log(String msg) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("[" + LEVEL + "]" + " " + dt.format(now) + " " + NAME + " - " + msg);
    }

    public void log(String template, Object[] args) {
        log(String.format((template) + "%n", args));
    }

    public void debug(String msg) {
        log(msg);
    }

    public void debug(String template, Object... args) {
        log(template, args);
    }

    public void info(String msg) {
        if (!Objects.equals(LEVEL, "DEBUG"))
            log(msg);
    }

    public void info(String template, Object... args) {
        if (!Objects.equals(LEVEL, "DEBUG"))
            log(template, args);
    }

    public void warning(String msg) {
        if (!Objects.equals(LEVEL, "DEBUG") && !Objects.equals(LEVEL, "INFO"))
            log(msg);
    }

    public void warning(String template, Object... args) {
        if (!Objects.equals(LEVEL, "DEBUG") && !Objects.equals(LEVEL, "INFO"))
            log(template, args);
    }

    public void error(String msg) {
        if (Objects.equals(LEVEL, "ERROR"))
            log(msg);
    }

    public void error(String template, Object... args) {
        if (Objects.equals(LEVEL, "ERROR"))
            log(template, args);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        return o instanceof Logger
                && hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return NAME.hashCode();
    }
}
