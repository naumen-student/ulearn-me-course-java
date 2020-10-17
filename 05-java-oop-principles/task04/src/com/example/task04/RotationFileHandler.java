package com.example.task04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler{
    private final ChronoUnit rotationInterval;
    private final String name;
    private final String filePath;
    private final String fileExtension;

    public RotationFileHandler(String name, ChronoUnit rotationInterval, String filePathWithoutExtension, String fileExtension){
        this.name = name;
        this.rotationInterval = rotationInterval;
        this.filePath = filePathWithoutExtension;
        this.fileExtension = fileExtension;
    }

    @Override
    public void log(Level severityLevel, String message) {
        try {
            new FileHandler(name, String.format("%s%s%s", filePath, DateTimeFormatter.ofPattern("yyyy.MM.dd hh.mm.ss")
                    .format(LocalDateTime.now()
                            .truncatedTo(rotationInterval)), fileExtension)).log(severityLevel, message);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(Level severityLevel, String template, Object... args) {
        log(severityLevel, String.format(template, args));
    }
}
