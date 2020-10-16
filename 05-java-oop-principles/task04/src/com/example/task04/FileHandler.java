package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FileHandler implements MessageHandler{
    private final String name;
    private FileWriter writer;

    public FileHandler(String name, String path){
        this.name = name;
        try {
            writer = new FileWriter(path, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(Logger.Level level, String message) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        try {
            writer.append(String.format("[%s] %s %s - %s%n", level, dateFormat.format(new Date()), name, message));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(Logger.Level level, String format, Object... args) {
        log(level, String.format(format, args));
    }
}
