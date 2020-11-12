package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler {
    private final ChronoUnit interval;
    private final String path;

    public RotationFileHandler(String path, ChronoUnit interval) {
        this.path = path;
        this.interval = interval;
    }

    @Override
    public void logMessage(String msg) {
        try(FileWriter fileWriter = new FileWriter(String.format(path + "log%s.txt",
                LocalDateTime.now().truncatedTo(interval).toString()), true)) {
            fileWriter.write(msg);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
