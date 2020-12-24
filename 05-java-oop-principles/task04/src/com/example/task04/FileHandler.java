package com.example.task04;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandler implements MessageHandler {

    private final String path;

    public FileHandler(String path) {
        this.path = path;
    }

    @Override
    public void handleMessage(String message) {
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write(message);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
