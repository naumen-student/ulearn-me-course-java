package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler
{
    @Override
    public void logMes(String message)
    {
        try
        {
            FileWriter writer = new FileWriter("log.txt", false);
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException x) {
            System.out.print(x.toString());
        }
    }
}