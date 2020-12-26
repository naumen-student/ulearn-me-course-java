package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileHandler implements MessageHandler{
    private final File file;

    public FileHandler(String path){
        file = new File(path);
    }

    @Override
    public void handleLog(String log) throws IOException{
        FileWriter writer = new FileWriter(file);
        writer.append(log).append("/n");
        writer.flush();
        writer.close();
    }
}