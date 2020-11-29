package com.example.task04;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler extends MessageHandler {
    private final ChronoUnit interval;

    public RotationFileHandler(ChronoUnit interval) {
        this.interval = interval;
    }

    @Override
    public void log(String message) {
        String now = LocalDateTime.now().truncatedTo(interval).toString();
        try {
            FileWriter fileWriter = new FileWriter(String.format("log %s.txt", now), false);
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.print(e.toString());
        }
    }
}
