package com.example.task04;
import java.io.*;

public class FileHandler implements MessageHandler {
    @Override
    public void outMessage(String message) {
        try(FileWriter writer = new FileWriter("text.txt", false)){
            writer.write(message);
            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
