package com.example.task04;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler extends MessageHandler {
    @Override
    public void log(String msg) {
        try {
            FileWriter fileWriter = new FileWriter("log.txt", false);
            fileWriter.write(msg + "\n");
            fileWriter.flush();
        } catch (IOException x) {
            System.out.print(x.toString());
        }
    }
}