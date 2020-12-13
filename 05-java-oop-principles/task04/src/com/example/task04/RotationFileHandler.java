package com.example.task04;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler{
    private final String directoryPath;
    private LocalDateTime localDateTime = LocalDateTime.now();
    private final ChronoUnit chronoUnit;

    public RotationFileHandler(String directoryPath, ChronoUnit chronoUnit) {
        this.directoryPath = directoryPath;
        this.chronoUnit = chronoUnit;
    }

    @Override
    public void handle(String message) {
        try {
            FileWriter fileWriter = new FileWriter(getFilePath(), true);
            fileWriter.write(message);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getFilePath() {
        if (LocalDateTime.now().isAfter(localDateTime.plus(1, chronoUnit))) {
            localDateTime = LocalDateTime.now();
        }

        return String.format("%s/%s.log", directoryPath, localDateTime);
    }
}