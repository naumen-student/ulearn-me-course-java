package com.example.task04;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler extends MessageHandler {
    @Override
    public void log(String message) {
        try {
            FileWriter fileWriter = new FileWriter("log.txt", false);
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException x) {
            System.out.print(x.toString());
        }
    }
}