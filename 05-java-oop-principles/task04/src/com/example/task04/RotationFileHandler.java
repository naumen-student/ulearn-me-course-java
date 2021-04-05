package com.example.task04;

import java.io.IOException;
import java.io.FileWriter;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class RotationFileHandler implements MessageHandler{

    private final ChronoUnit interval;

    public RotationFileHandler(ChronoUnit interval){
        this.interval = interval;
    }
    @Override
    public void log(String message) throws IOException {
        String time = LocalTime.now().truncatedTo(interval).toString();
        FileWriter fileWriter = new FileWriter(String.format("log %s.txt", time), false);
        fileWriter.write(message + "\n");
        fileWriter.flush();
    }
}
