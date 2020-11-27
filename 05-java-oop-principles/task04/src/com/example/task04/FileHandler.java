package com.example.task04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {

    private final File file;

    public FileHandler(String path) throws IOException {
        file = new File(path);
        file.createNewFile();
    }

    @Override
    public void handleLog(String log) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.append(log).append("/n");
        writer.flush();
        writer.close();
    }
}
