package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;

class ConsoleHandler implements MessageHandler {
    @Override
    public void logMes(String message) {
        System.out.println(message);
    }
}


class FileHandler implements MessageHandler {
    @Override
    public void logMes(String message) {
        try {
            FileWriter writer = new FileWriter("log.txt", false);
            writer.write(message);
            writer.flush();
        } catch (IOException error) {
            System.out.print(error.toString());
        }
    }
}


enum Level {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}

class Logger {
    private final String name;
    private static final HashMap<String, Logger> loggers = new HashMap<>();
    private Level level;

    public Logger(String name) {
        this.name = name;
        loggers.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static Logger getLogger(String name) {
        if (loggers.containsKey(name))
            return loggers.get(name);
        else return new Logger(name);
    }

    public void error(String message) {
        log(Level.ERROR, message);
    }

    public void error(String template, Object... args) {
        log(Level.ERROR, template, args);
    }

    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    public void debug(String template, Object... args) {
        log(Level.DEBUG, template, args);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void info(String template, Object... args) {
        log(Level.INFO, template, args);
    }

    public void log(Level severityLevel, String message, Object... args) {
        log(severityLevel, String.format(message, args));
    }

    public void log(Level severityLevel, String message) {
        if (level.ordinal() >= getLevel().ordinal()) {
            DateFormat date = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
            System.out.printf("[{0}] {1} {2} - {3}%n", level, date, this.name, message);
        }
    }

    public void warning(String message) {
        log(Level.WARNING, message);
    }

    public void warning(String template, Object... args) {
        log(Level.WARNING, template, args);
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }
}


class MemoryHandler implements MessageHandler {

    private final long size;
    private final ArrayList<String> messages = new ArrayList<>();
    private final MessageHandler handler;

    public MemoryHandler(long size, MessageHandler handler) {
        this.size = size;
        this.handler = handler;
    }

    @Override
    public void logMes(String message) {
        messages.add(message);
        if (messages.size() >= size) {
            for (String savedMessage : messages) {
                handler.logMes(savedMessage);
            }
            messages.clear();
        }
    }
}

interface MessageHandler {
    public void logMes(String message);
}


class RotationFileHandler implements MessageHandler {

    String filePath;
    ChronoUnit rotation;

    public RotationFileHandler(String filepath, ChronoUnit rotation) throws IOException {
        this.filePath = filepath;
        this.rotation = rotation;
    }

    @Override
    public void logMes(String message) {
        LocalDateTime now = LocalDateTime.now().truncatedTo(rotation);
        try {
            FileWriter fileWriter = new FileWriter(String.format("log %s.txt", now), false);
            fileWriter.append(message + "\n");
            fileWriter.flush();
        } catch (IOException x) {
            System.out.print(x.toString());
        }
    }
}
