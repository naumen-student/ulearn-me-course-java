package com.example.task04;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class RotationFileHandler implements MessageHandler {

    private FileWriter fileWriter;
    private LocalDateTime creationTime;
    private int intervalInSeconds;
    private Logger logger;

    public RotationFileHandler(Logger logger){
        creationTime = LocalDateTime.now();
        this.intervalInSeconds = 3600;
        this.logger = logger;
        try {
            this.fileWriter = new FileWriter("logs.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void log(String message){
        LocalDateTime timeNow = LocalDateTime.now();
        if(creationTime.isAfter(timeNow.minusSeconds(intervalInSeconds))) {
            try {
                fileWriter.append(message);
                fileWriter.flush();
            }
            catch (IOException exp) {
                System.out.println(exp);
            }
        }
        else{
            try{
                FileWriter fw = new FileWriter(  LocalDateTime.now() + ".txt");
                fw.append(message);
                fw.flush();
            }
            catch (IOException exp) {
                System.out.println(exp);
            }

        }
    }
}
