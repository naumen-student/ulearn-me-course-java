package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler{

    private String path;
    private FileWriter file;

    public FileHandler(String path) { this.path = path; }

    public FileWriter getFile() { return file; }

    @Override
    public void messageHandler(String message) {
        try {
            file = new FileWriter(path, true);
            file.write(message);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
