package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements MessageHandler {
    private FileWriter file;

    public void FileWriter(FileWriter file){
        this.file = file;
    }

    @Override
    public void handler(String message){
        try{
            file.append(message);
            file.flush();
        }
        catch (IOException exp){
            System.out.println(exp);
        }
    }
}
