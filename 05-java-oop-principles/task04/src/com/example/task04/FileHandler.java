package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {
    private final String directory;

    public FileHandler(String directory) {
        this.directory = directory;
    }

    @Override
    public void handleMessage(String message) {
        try (FileWriter fileWriter = new FileWriter(directory, true)) {
            fileWriter.write(message);
            fileWriter.flush();
        }
        catch (IOException exptn) {
            System.out.println(exptn.getMessage());
        }
    }
}
