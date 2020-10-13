package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {
    private final FileWriter fileWriter;

    public FileHandler(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public FileHandler(String str) throws IOException {
        this.fileWriter = new FileWriter(str, false);
    }

    @Override
    public void HandleMessage(String t, Object... messageArgs) {
        String res = String.format(t, messageArgs);
        try {
            fileWriter.write(res);
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
            return;
        }
    }
}
