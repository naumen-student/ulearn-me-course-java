package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {

    @Override
    public void log(String message) {
        try {
            FileWriter writer = new FileWriter("log.txt");
            writer.write(message);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}