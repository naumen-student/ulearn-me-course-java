package com.example.task04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {
    private final String fullPath;
    public FileHandler(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void handle(String message) throws IOException {
        File f = new File(fullPath);
        f.createNewFile();
        FileWriter w = new FileWriter(f);
        w.append(message);
        w.flush();
        w.close();
    }
}
