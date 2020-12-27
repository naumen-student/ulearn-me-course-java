package com.example.task04;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RotationFileHandler implements MessageHandler{
    private Duration duration;
    private LocalDateTime lastSaved;

    public RotationFileHandler(Duration duration){
        this.lastSaved = LocalDateTime.now();
        this.duration = duration;
    }

    public void setDuration(Duration duration){
        this.duration = duration;
    }

    public Duration getDuration(){
        return this.duration;
    }

    @Override
    public void handleMessage(String message) {
        LocalDateTime now = LocalDateTime.now();
        if (now.isAfter(this.lastSaved.plusSeconds(this.duration.getSeconds()))){
            try{
                File fl = new File(String.format("%s.txt",
                        now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"))));
                if (!fl.exists()){
                    fl.createNewFile();
                }
                FileWriter fw = new FileWriter(fl, true);
                fw.append(message);
                fw.flush();
                fw.close();
                this.lastSaved = now;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
