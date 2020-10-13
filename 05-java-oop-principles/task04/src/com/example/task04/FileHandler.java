package com.example.task04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler{
    private final FileWriter fileWriter;

    public FileHandler(FileWriter fileWriter){ this.fileWriter = fileWriter; }

    public FileHandler(String path) throws IOException{ this.fileWriter = new FileWriter(path, false); }

    @Override
    public void HandleMessage(String template, Object... messageArgs){
        String result = String.format(template, messageArgs);
        try { fileWriter.write(result); }
        catch (IOException exception){
            System.out.println(exception.getMessage());
            return;
        }
    }
}