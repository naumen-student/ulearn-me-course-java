package com.example.task04;

import java.io.*;

public class FileHandler implements MessageHandler {

    private final String path;

    public FileHandler(String path) {
        this.path = path;
    }

    @Override
    public void logMessage(String message) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(message);
            fileWriter.flush();
        } catch (IOException exception) {
            System.out.print(exception.toString());
        }
    }
}