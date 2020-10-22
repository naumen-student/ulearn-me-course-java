package com.example.task04;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler{
    private final ChronoUnit interval;
    private final String path;

    public RotationFileHandler(ChronoUnit interval, String path) {
        this.interval = interval;
        this.path = path;
    }

    @Override
    public void handleLog(String log) throws IOException {
        LocalDateTime dateInterval = LocalDateTime.now().truncatedTo(interval);
        File file = new File(path + dateInterval + ".txt");
        FileWriter writer = new FileWriter(file);
        writer.append(log).append("/n");
        writer.flush();
        writer.close();
    }
}
