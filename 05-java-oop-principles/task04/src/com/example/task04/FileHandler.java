package com.example.task04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {
    private FileWriter filePatch;

    public FileHandler(File file) throws IOException {
        filePatch = new FileWriter(file, true);
    }

    @Override
    public void handleMessage(String mes) {
        try {
            filePatch.append(mes + "\n");
            filePatch.flush();
            filePatch.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
