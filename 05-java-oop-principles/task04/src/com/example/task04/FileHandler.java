package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler{

    @Override
    public void log(String message) throws IOException {
        FileWriter fileWriter = new FileWriter("log.txt", false);
        fileWriter.write(message + "\n");
        fileWriter.flush();
    }
}
