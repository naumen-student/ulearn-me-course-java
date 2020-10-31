package com.example.task04;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler {
    private final ChronoUnit amount;
    private final String fullPath;

    public RotationFileHandler(ChronoUnit amount, String fullPath) {
        this.amount = amount;
        this.fullPath = fullPath;
    }

    @Override
    public void handle(String message) throws IOException {
        LocalDateTime l = LocalDateTime.now().truncatedTo(amount);
        File f = new File(fullPath + l + ".txt");
        f.createNewFile();
        FileWriter w = new FileWriter(f);
        w.append(message);
        w.flush();
        w.close();
    }
}
