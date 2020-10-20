package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler{
    @Override
    public void logMes(String message) {
        try {
            FileWriter writer = new FileWriter("log.txt", false);
            writer.write(message);
            writer.flush();
        }
        catch (IOException error) {
            System.out.print(error.toString());
        }
    }
}
