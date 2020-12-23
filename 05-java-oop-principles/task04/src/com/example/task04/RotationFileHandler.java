package com.example.task04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Period;

public class RotationFileHandler implements MessageHandler {
    private FileWriter file;
    private LocalDateTime creationTime;
    private int intervalInSeconds;

    public void FileWriter(FileWriter file,int intervalInSeconds){
        this.file = file;
        creationTime = LocalDateTime.now();
        this.intervalInSeconds = intervalInSeconds;
    }

    @Override
    public void handler(String message){
        LocalDateTime timeNow = LocalDateTime.now();
        if(creationTime.isAfter(timeNow.minusSeconds(intervalInSeconds))) {
            try {
                file.append(message);
                file.flush();
            }
            catch (IOException exp) {
                System.out.println(exp);
            }
        }
        else{
            try{
                File newFile = new File("D:\\dataMessage" + LocalDateTime.now() + ".txt");
                FileWriter fw = new FileWriter(newFile);
                fw.append(message);
                fw.flush();
            }
            catch (IOException exp) {
                System.out.println(exp);
            }

        }
    }
}
