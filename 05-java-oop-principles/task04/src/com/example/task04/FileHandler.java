package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler{
    private final String path;

    public FileHandler(String path) {
        this.path = path;
    }

    @Override
    public void handle(String message) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, true);
            fileWriter.write(message);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
