package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler {
    public final ChronoUnit rotationPeriod;

    public RotationFileHandler(ChronoUnit rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    @Override
    public void handlerLog(String message) throws IOException {
        String fileName = LocalDateTime.now().truncatedTo(rotationPeriod)
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + ".txt";
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(message);
        writer.close();
    }
}
