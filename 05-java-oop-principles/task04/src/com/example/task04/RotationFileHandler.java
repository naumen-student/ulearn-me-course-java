package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler {

    private final ChronoUnit interval;

    public RotationFileHandler(ChronoUnit interval) {
        this.interval = interval;
    }

    @Override
    public void log(String message) {
        String time = LocalDateTime.now().truncatedTo(interval).toString();
        try {
            FileWriter writer = new FileWriter(String.format("%S log.txt", time));
            writer.write(message);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}