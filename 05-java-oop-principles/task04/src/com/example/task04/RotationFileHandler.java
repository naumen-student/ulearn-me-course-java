package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler {

    private final ChronoUnit chronoUnit;
    private final String filePath;
    private LocalDateTime writeTime = LocalDateTime.now();

    public RotationFileHandler(ChronoUnit chronoUnit, String filePath) {
        this.chronoUnit = chronoUnit;
        this.filePath = filePath;
    }

    public void handle(String message) {
        if (LocalDateTime.now().isAfter(writeTime.plus(1, chronoUnit))) {
            writeTime = LocalDateTime.now();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd-hh_mm_ss");
        try {
            FileWriter fw = new FileWriter(String.format("%s_%s.txt", filePath, writeTime.format(formatter)), true);
            fw.write(message);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
