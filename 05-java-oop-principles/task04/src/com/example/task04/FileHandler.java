package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler{
    private final String path;

    public FileHandler(String path) {
        this.path = path;
    }

    @Override
    public void logMessage(String msg){
        try (FileWriter fileWriter = new FileWriter(path + "\\log.txt", true)) {
            fileWriter.write(msg);
            fileWriter.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
