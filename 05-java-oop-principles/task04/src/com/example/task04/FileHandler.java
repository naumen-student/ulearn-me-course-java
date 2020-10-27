package com.example.task04;

import java.io.*;

public class FileHandler implements MessageHandler {
    private final String path;

    public FileHandler(String path) {
        this.path = path;
    }

    @Override
    public void logMessage(String message) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, true);
            fileWriter.append(message.concat("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
