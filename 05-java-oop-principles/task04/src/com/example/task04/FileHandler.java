package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {
    FileWriter writer;
    Logger logger;

    public FileHandler(Logger logger) {
        try {
            this.logger = logger;
            writer = new FileWriter("Logs.txt", true);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Logs.txt not find");
        }
    }

    @Override
    public void log(String message) {
        try {
            writer = new FileWriter("Logs.txt", true);
            writer.write(message + "\n");
            writer.close();
        } catch (IOException e) {
        System.out.println("Logs.txt not find");
    }
    }
}
