package com.example.task04;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler {

    private final ChronoUnit chronoUnit;
    private final String path;

    public RotationFileHandler(ChronoUnit chronoUnit, String path) {
        this.chronoUnit = chronoUnit;
        this.path = path;
    }

    @Override
    public void handleMassage(String message) {
        String timeNow = LocalDateTime.now().truncatedTo(chronoUnit).format(DateTimeFormatter.ofPattern("yyyy_MM_dd_hh_mm"));
        FileHandler fileHandler = new FileHandler(MessageFormat.format("{0}_{1}.txt", path, timeNow));
        fileHandler.handleMassage(message);
    }
}
