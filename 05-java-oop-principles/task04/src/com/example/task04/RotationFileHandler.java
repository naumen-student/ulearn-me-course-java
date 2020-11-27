package com.example.task04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler{

    private final ChronoUnit rotationInterval;
    private final String directory;

    public RotationFileHandler(ChronoUnit rotationInterval, String directory) {
        this.rotationInterval = rotationInterval;
        this.directory = directory;
    }

    @Override
    public void handleLog(String log) throws IOException {
        LocalDateTime interval = LocalDateTime.now().truncatedTo(rotationInterval);
        File file = new File(directory + interval + ".txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.append(log).append("/n");
        writer.flush();
        writer.close();
    }
}
