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
    public void logMessage(String message) {
        try {
            FileWriter fileWriter = new FileWriter(String.format("log-%s.txt",
                    LocalDateTime.now().truncatedTo(interval).toString()), false);
            fileWriter.write(message);
            fileWriter.flush();
        } catch (IOException exception) {
            System.out.print(exception.toString());
        }
    }
}
