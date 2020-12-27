package com.example.task04;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MemoryHandler implements MessageHandler{
    private ArrayList<String> cache;
    private int size;

    public MemoryHandler(int size){
        this.size = size;
        this.cache = new ArrayList<>();
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void handleMessage(String message) {
        this.cache.add(message);
        if (this.cache.size() > this.size){
            try{
                File fl = new File(String.format("%s.txt", LocalDateTime.now().
                        format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"))));
                if (!fl.exists()){
                    fl.createNewFile();
                }
                FileWriter fw = new FileWriter(fl, true);
                for (String msg : this.cache) {
                    fw.write(msg + "\n");
                }
                fw.flush();
                fw.close();
                this.cache.clear();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
