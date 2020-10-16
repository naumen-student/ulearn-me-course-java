package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {

    private final String path;

    public FileHandler(String path) {
        this.path = path;
    }

    @Override
    public void logMessage(String message) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(message);
        fileWriter.flush();
    }
}
