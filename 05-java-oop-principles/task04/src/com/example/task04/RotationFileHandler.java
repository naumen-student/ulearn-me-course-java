package com.example.task04;
import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RotationFileHandler implements MessageHandler{
    private Duration duration;
    private LocalDateTime lastSave;

    public RotationFileHandler(Duration duration){
        this.lastSave = LocalDateTime.now();
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
        if (now.isAfter(this.lastSave.plusSeconds(this.duration.getSeconds()))){
            try{
                File file = new File(String.format("%s.txt",
                        now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"))));
                if (!file.exists()){
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file, true);
                fw.append(message);
                fw.flush();
                fw.close();
                this.lastSave = now;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}