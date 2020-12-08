package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler{

    final String path;

    public FileHandler(String path){
        this.path = path;
    }

    @Override
    public void messageLog(String message) throws IOException {
        FileWriter writer = new FileWriter(path, true);
        writer.write(message);
        writer.close();
    }
}
