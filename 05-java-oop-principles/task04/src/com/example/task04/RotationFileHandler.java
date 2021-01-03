package com.example.task04;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler {
    private String path;
    private ChronoUnit chronoUnit;

    public RotationFileHandler(ChronoUnit chronoUnit, String path) {
        this.chronoUnit = chronoUnit;
        this.path = path;
    }

    public String getPath() { return path; }

    @Override
    public void messageHandler(String message) {
        String time = LocalDateTime.now().truncatedTo(chronoUnit).format(DateTimeFormatter.ofPattern("yyyy_MM_dd_hh_mm_ss"));
        FileHandler fileHandler = new FileHandler(MessageFormat.format("{0}_{1}", path, time));
        fileHandler.messageHandler(message);
    }
}
