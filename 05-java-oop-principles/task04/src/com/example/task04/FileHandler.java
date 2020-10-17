package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileHandler implements MessageHandler{
    private final String name;
    private final String filePath;

    public FileHandler(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
    }

    @Override
    public void log(Level severityLevel, String message) {
        try(FileWriter writer = new FileWriter(filePath, false)) {
            writer.write(String.format("[%s] %s %s - %s%n", severityLevel.toString()
                    , new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date()), name, message));
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void log(Level severityLevel, String template, Object... args) {
        log(severityLevel, String.format(template, args));
    }
}
