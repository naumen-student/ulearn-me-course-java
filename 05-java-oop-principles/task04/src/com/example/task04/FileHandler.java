package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileHandler implements MessageHandler{
    private final String name;
    private FileWriter writer;

    public FileHandler(Logger logger, String path){
        this.name = logger.getName();
        try {
            writer = new FileWriter(path, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(Logger.Level level, String message) {
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
        try {
            writer.append(String.format("[%S] %s %s - %s%n", level, dateTime, name, message));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(Logger.Level level, String pattern, Object... args) {
        log(level, String.format(pattern, args));
    }
}