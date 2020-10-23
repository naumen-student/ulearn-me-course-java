package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {
    final String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void handlerLog(String message) throws IOException {
        FileWriter writer = new FileWriter(filePath, true);
        writer.write(message);
        writer.close();
    }
}
