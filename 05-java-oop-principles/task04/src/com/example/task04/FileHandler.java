package com.example.task04;

import java.io.*;


public class FileHandler implements MessageHandler {

    @Override
    public void logMessage(String message) {
        try {
            FileWriter writer = new FileWriter("log.txt", false);
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.print(e.toString());
        }
    }
}
