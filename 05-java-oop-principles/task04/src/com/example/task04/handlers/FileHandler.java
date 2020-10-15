package com.example.task04.handlers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler
{
    private String path;

    public FileHandler(String path) throws IOException
    {
        File file = new File(path);
        file.createNewFile();
        this.path = path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }

    public void execute(String message) throws IOException {
        File file = new File(this.path);
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write(message);
        writer.flush();
    }
}
