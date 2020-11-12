package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {

    private final String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void handle(String message) {
        try {
            FileWriter fw = new FileWriter(filePath, true);
            fw.write(message);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
