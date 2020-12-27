package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler
{
    String filePath;
    ChronoUnit rotation;

    public RotationFileHandler(String filepath, ChronoUnit rotation) throws IOException
    {
        this.filePath = filepath;
        this.rotation = rotation;
    }

    @Override
    public void logMes(String message)
    {
        LocalDateTime now = LocalDateTime.now().truncatedTo(rotation);
        try
        {
            FileWriter fileWriter = new FileWriter(String.format("log %s.txt", now), false);
            fileWriter.append(message + "\n");
            fileWriter.flush();
        } catch (IOException x)
        {
            System.out.print(x.toString());
        }
    }
}