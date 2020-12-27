package com.example.task04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler{
    private FileWriter fw;

    public FileHandler(File file) throws IOException {
        fw = new FileWriter(file, true);
    }

    @Override
    public void handleMessage(String message){
        try {
            fw.append(message + "\n");
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}